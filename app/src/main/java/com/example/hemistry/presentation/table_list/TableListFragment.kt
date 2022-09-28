package com.example.hemistry.presentation.table_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hemistry.R
import com.example.hemistry.databinding.ActivityMainBinding
import com.example.hemistry.databinding.FragmentTableListBinding

class TableListFragment : Fragment() {

    private var _binding: FragmentTableListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTableListBinding.inflate(layoutInflater, container, false)
        binding.root.setOnClickListener {
            findNavController().navigate(R.id.action_tableListFragment_to_detailsFragment)
        }
        return binding.root
    }
}