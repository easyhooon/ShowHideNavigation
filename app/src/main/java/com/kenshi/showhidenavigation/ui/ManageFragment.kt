package com.kenshi.showhidenavigation.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.kenshi.showhidenavigation.databinding.FragmentManageBinding

class ManageFragment : Fragment() {

    lateinit var binding: FragmentManageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("onCreate", "ManageFragment:${this.hashCode()}")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentManageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("onViewCreated", "ManageFragment:${this.hashCode()}")

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
        Log.d("onDestroyView", "ManageFragment is Destroyed")
    }
}