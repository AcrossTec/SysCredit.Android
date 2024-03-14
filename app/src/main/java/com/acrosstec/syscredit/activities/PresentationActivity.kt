package com.acrosstec.syscredit.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.acrosstec.syscredit.R
import com.acrosstec.syscredit.databinding.ActivityPresentationBinding
import com.acrosstec.syscredit.fragments.presentations.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class PresentationActivity : AppCompatActivity()
{
    private lateinit var Binding: ActivityPresentationBinding

    //Components
    private lateinit var TabLayout: TabLayout
    private lateinit var ViewPager: ViewPager2
    private lateinit var ViewPagerAdapter: ViewPagerAdapter

    override fun onCreate(SavedInstanceState: Bundle?)
    {
        super.onCreate(SavedInstanceState)
        setContentView(R.layout.activity_presentation)

        InitializeComponents()
        ConfigureListenerComponents()
    }

    private fun InitializeComponents()
    {
        //Binding
        Binding = ActivityPresentationBinding.inflate(layoutInflater)
        setContentView(Binding.root)

        //Components
        TabLayout = Binding.tabLayout
        ViewPager = Binding.viewPager
        ViewPagerAdapter = ViewPagerAdapter(this)
    }

    private fun ConfigureListenerComponents()
    {
        ViewPager.adapter = ViewPagerAdapter
        ViewPager.post { ViewPager.requestLayout() }

        TabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener
        {
            override fun onTabSelected(tab: TabLayout.Tab?)
            {
                ViewPager.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?)
            {
                //Nothing
            }

            override fun onTabReselected(tab: TabLayout.Tab?)
            {
                //Nothing
            }
        })

        ViewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback()
        {
            override fun onPageSelected(position: Int)
            {
                TabLayout.selectTab(TabLayout.getTabAt(position))
            }
        })
    }
}