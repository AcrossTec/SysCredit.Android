package com.acrosstec.syscredit.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.acrosstec.syscredit.databinding.FragmentHomeBinding

class HomeFragment : Fragment()
{
    private var _Binding: FragmentHomeBinding? = null

    private val Binding get() = _Binding!!

    override fun onCreateView(
        Inflater: LayoutInflater,
        Container: ViewGroup?,
        SavedInstanceState: Bundle?
    ): View
    {
        _Binding = FragmentHomeBinding.inflate(Inflater, Container, false)
        return Binding.root
    }

    override fun onDestroyView()
    {
        super.onDestroyView()
        _Binding = null
    }
}