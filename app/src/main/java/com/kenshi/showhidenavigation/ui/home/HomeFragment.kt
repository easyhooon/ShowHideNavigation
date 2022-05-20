package com.kenshi.showhidenavigation.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kenshi.showhidenavigation.R
import com.kenshi.showhidenavigation.databinding.FragmentHomeBinding
import com.kenshi.showhidenavigation.ui.base.BaseFragment
import timber.log.Timber

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("${this.hashCode()}")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.handler = this
    }

    fun navigateToDetail(view: View) {
        findNavController().navigate(R.id.action_home_to_detail)
    }
}