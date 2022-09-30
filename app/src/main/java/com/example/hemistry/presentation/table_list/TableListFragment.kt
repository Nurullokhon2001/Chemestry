package com.example.hemistry.presentation.table_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.hemistry.R
import com.example.hemistry.databinding.FragmentTableListBinding
import com.example.hemistry.presentation.adapter.TableListAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TableListFragment : Fragment() {

    private var _binding: FragmentTableListBinding? = null
    private val binding get() = _binding!!

    private val adapter by lazy { TableListAdapter() }
    private val viewModel by viewModels<TableListViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTableListBinding.inflate(layoutInflater, container, false)

        viewModel.getTableList().observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }

        binding.root.setOnClickListener {
            findNavController().navigate(R.id.action_tableListFragment_to_detailsFragment)
        }

        binding.list.adapter = adapter
        return binding.root
    }
}