package com.acrosstec.syscredit.fragments

import androidx.fragment.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.acrosstec.syscredit.databinding.FragmentConstructionBinding

class ConstructionFragment : Fragment()
{
    private var _Binding: FragmentConstructionBinding? = null

    override fun onCreateView(Inflater: LayoutInflater, Container: ViewGroup?, SavedInstanceState: Bundle?): View
    {
        _Binding = FragmentConstructionBinding.inflate(Inflater, Container, false)
        return _Binding!!.root
    }
}