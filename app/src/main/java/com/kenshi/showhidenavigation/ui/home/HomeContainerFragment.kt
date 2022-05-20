package com.kenshi.showhidenavigation.ui.home

import android.os.Bundle
import com.kenshi.showhidenavigation.R
import com.kenshi.showhidenavigation.databinding.FragmentHomeContainerBinding
import com.kenshi.showhidenavigation.ui.base.BaseFragment
import timber.log.Timber

class HomeContainerFragment: BaseFragment<FragmentHomeContainerBinding>(R.layout.fragment_home_container) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("${this.hashCode()}")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Timber.d("HomeContainerFragment is Destroyed")
    }
}
