package com.kenshi.showhidenavigation.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.kenshi.showhidenavigation.R
import com.kenshi.showhidenavigation.databinding.FragmentHomeContainerBinding
import com.kenshi.showhidenavigation.databinding.FragmentManageBinding
import com.kenshi.showhidenavigation.navigation.KeepStateNavigator

class ManageFragment : Fragment() {

    lateinit var binding: FragmentManageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("onCreate", "MainFragment")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentManageBinding.inflate(inflater, container, false)
        return binding.root
    }
}