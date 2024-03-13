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
import com.acrosstec.syscredit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var AppBarConfiguration: AppBarConfiguration
    private lateinit var Binding: ActivityMainBinding

    override fun onCreate(SavedInstanceState: Bundle?)
    {
        super.onCreate(SavedInstanceState)

        Binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(Binding.root)

        setSupportActionBar(Binding.appBarMain.toolbar)
        supportActionBar!!.setDisplayShowTitleEnabled(false)

        val DrawerLayout: DrawerLayout = Binding.drawerLayout
        val NavView: NavigationView = Binding.navView
        val NavController = findNavController(R.id.nav_host_fragment_content_main)

        AppBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home
            ), DrawerLayout
        )

        NavView.setupWithNavController(NavController)

        val MenuButton = findViewById<ImageButton>(R.id.menu_button)
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