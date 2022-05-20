package com.kenshi.showhidenavigation.ui.detail

import android.os.Bundle
import android.util.Log
import com.kenshi.showhidenavigation.R
import com.kenshi.showhidenavigation.databinding.FragmentDetailBinding
import com.kenshi.showhidenavigation.ui.base.BaseFragment
import timber.log.Timber

class DetailFragment: BaseFragment<FragmentDetailBinding>(R.layout.fragment_detail){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("${this.hashCode()}")
    }

    //호출되지 않음
    override fun onDestroyView() {
        super.onDestroyView()
        Timber.d("DetailFragment is Destroyed")
    }
}