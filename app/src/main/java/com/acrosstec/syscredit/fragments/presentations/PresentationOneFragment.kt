package com.acrosstec.syscredit.fragments.presentations

import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.acrosstec.syscredit.MainActivity
import com.acrosstec.syscredit.R
import com.acrosstec.syscredit.databinding.FragmentPresentationOneBinding

class PresentationOneFragment : Fragment()
{
    private lateinit var Binding: FragmentPresentationOneBinding
    private lateinit var ViewPager : ViewPager2

    // Components
    private lateinit var TvDescription: TextView
    private lateinit var SkipButton: Button
    private lateinit var NextButton: Button

    override fun onCreateView(Inflater: LayoutInflater, Container: ViewGroup?, SavedInstanceState: Bundle?): View
    {
        Binding = FragmentPresentationOneBinding.inflate(Inflater, Container, false)

        InitializeComponents()
        ConfigureListenerComponents()

        return Binding.root
    }

    private fun InitializeComponents()
    {
        ViewPager = activity?.findViewById(R.id.view_pager)!!

        TvDescription = Binding.tvPresentationNumberOne
        SkipButton = Binding.btnSkipPresentationOne
        NextButton = Binding.btnNextPresentationOne
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