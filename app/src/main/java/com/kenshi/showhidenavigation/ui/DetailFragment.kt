package com.kenshi.showhidenavigation.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kenshi.showhidenavigation.databinding.FragmentDetailBinding

class DetailFragment: Fragment() {
    private lateinit var binding: FragmentDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("onCreate", "DetailFragment:${this.hashCode()}")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    //호출되지 않음
    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("onDestroyView", "DetailFragment is Destroyed")
    }
}