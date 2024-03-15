package com.acrosstec.syscredit.fragments.presentations

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.acrosstec.syscredit.MainActivity
import com.acrosstec.syscredit.R
import com.acrosstec.syscredit.databinding.FragmentPresentationOneBinding
import com.acrosstec.syscredit.databinding.FragmentPresentationTwoBinding

class PresentationTwoFragment : Fragment()
{
    private lateinit var _Binding : FragmentPresentationTwoBinding
    private lateinit var ViewPager : ViewPager2

    // Components
    private lateinit var TvDescription: TextView
    private lateinit var SkipButton: Button
    private lateinit var NextButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        _Binding = FragmentPresentationTwoBinding.inflate(inflater, container, false)

        InitializeComponents()
        ConfigureListenerComponents()

        return _Binding.root
    }

    private fun InitializeComponents()
    {
        ViewPager = activity?.findViewById(R.id.view_pager)!!

        TvDescription = _Binding.tvPresentationNumberTwo
        SkipButton = _Binding.btnSkipPresentationTwo
        NextButton = _Binding.btnNextPresentationTwo
    }

    private fun ConfigureListenerComponents()
    {
        SkipButton.setOnClickListener {
            val Intent = Intent(activity, MainActivity::class.java)
            startActivity(Intent)
            activity?.finish()
        }

        NextButton.setOnClickListener {
            ViewPager.currentItem += 1
        }
    }
}