package com.example.hemistry.presentation.element_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.hemistry.databinding.FragmentElementListBinding
import com.example.hemistry.presentation.adapter.TableListAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ElementListFragment : Fragment() {

    private var _binding: FragmentElementListBinding? = null
    private val binding get() = _binding!!

    private val adapter by lazy { TableListAdapter(
       tableListClickListener = {
           val action = ElementListFragmentDirections.actionElementListFragmentToDetailsFragment(it)
           findNavController().navigate(action)
       }
    ) }
    private val viewModel by viewModels<ElementListViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentElementListBinding.inflate(layoutInflater, container, false)

        viewModel.getTableList().observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }

        binding.list.adapter = adapter
        return binding.root
    }
}