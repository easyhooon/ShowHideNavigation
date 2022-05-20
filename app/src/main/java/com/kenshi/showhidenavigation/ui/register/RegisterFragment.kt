package com.kenshi.showhidenavigation.ui.register

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kenshi.showhidenavigation.R
import com.kenshi.showhidenavigation.databinding.FragmentRegisterBinding
import com.kenshi.showhidenavigation.ui.base.BaseFragment
import timber.log.Timber

class RegisterFragment : BaseFragment<FragmentRegisterBinding>(R.layout.fragment_register) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("${this.hashCode()}")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Timber.d("RegisterFragment is Destroyed")
    }
}