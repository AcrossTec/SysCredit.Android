package com.acrosstec.syscredit.fragments.presentations

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.acrosstec.syscredit.activities.PresentationActivity

class ViewPagerAdapter(Fragment: PresentationActivity) : FragmentStateAdapter(Fragment)
{
    override fun getItemCount(): Int
    {
        return 4
    }

    override fun createFragment(position: Int): Fragment
    {
        return when(position)
        {
            0 -> PresentationOneFragment()
            1 -> PresentationTwoFragment()
            2 -> PresentationThreeFragment()
            3 -> PresentationOneFragment()
            else -> PresentationOneFragment()
        }
    }
}