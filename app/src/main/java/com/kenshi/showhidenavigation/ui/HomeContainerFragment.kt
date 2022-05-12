package com.kenshi.showhidenavigation.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kenshi.showhidenavigation.R
import com.kenshi.showhidenavigation.databinding.FragmentHomeContainerBinding


class HomeContainerFragment : Fragment() {

    lateinit var binding: FragmentHomeContainerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("onCreate", "HomeContainerFragment")

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHomeContainerBinding.inflate(inflater, container, false)
        return binding.root
    }
}