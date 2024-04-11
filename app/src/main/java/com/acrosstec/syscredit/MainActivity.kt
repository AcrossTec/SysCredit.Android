package com.acrosstec.syscredit

import android.os.Bundle
import android.widget.ImageButton
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import com.acrosstec.syscredit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var AppBarConfiguration: AppBarConfiguration
    private lateinit var Binding: ActivityMainBinding

    // Components
    private lateinit var DrawerLayout: DrawerLayout
    private lateinit var NavView: NavigationView
    private lateinit var NavController: NavController
    private lateinit var MenuButton: ImageButton

    override fun onCreate(SavedInstanceState: Bundle?)
    {
        super.onCreate(SavedInstanceState)

        Binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(Binding.root)

        InitializeComponents()
        ConfigureComponents()
    }

    private fun InitializeComponents()
    {
        DrawerLayout = Binding.drawerLayout
        NavView = Binding.navView
        NavController = findNavController(R.id.nav_host_fragment_content_main)

        AppBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home
            ), DrawerLayout
        )

        MenuButton = findViewById(R.id.menu_button)
    }

    private fun ConfigureComponents()
    {
        setSupportActionBar(Binding.appBarMain.toolbar)
        supportActionBar!!.setDisplayShowTitleEnabled(false)

        NavView.setupWithNavController(NavController)

        MenuButton.setOnClickListener {
            DrawerLayout.open()
        }
    }

    override fun onSupportNavigateUp(): Boolean
    {
        val NavController = findNavController(R.id.nav_host_fragment_content_main)
        return NavController.navigateUp(AppBarConfiguration) || super.onSupportNavigateUp()
    }
}