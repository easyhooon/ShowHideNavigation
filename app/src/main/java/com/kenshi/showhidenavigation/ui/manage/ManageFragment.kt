package com.kenshi.showhidenavigation.ui.manage

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.kenshi.showhidenavigation.R
import com.kenshi.showhidenavigation.databinding.FragmentManageBinding
import com.kenshi.showhidenavigation.ui.base.BaseFragment
import timber.log.Timber

class ManageFragment : BaseFragment<FragmentManageBinding>(R.layout.fragment_manage) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("${this.hashCode()}")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = ManageAdapter()
        binding.recycler.layoutManager = LinearLayoutManager(requireContext())
        binding.recycler.addItemDecoration(DividerItemDecoration(requireContext(),
            DividerItemDecoration.VERTICAL))
        binding.recycler.adapter = adapter

        val data = (1..50).map { "Item $it" }
        adapter.submitList(data)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Timber.d("ManageFragment is Destroyed")
    }
}