package com.acrosstec.syscredit.fragments

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.acrosstec.syscredit.databinding.FragmentConstructionBinding

class ConstructionFragment : Fragment()
{
    private var _binding: FragmentConstructionBinding? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View
    {
        _binding = FragmentConstructionBinding.inflate(inflater, container, false)
        return _binding!!.root
    }
}