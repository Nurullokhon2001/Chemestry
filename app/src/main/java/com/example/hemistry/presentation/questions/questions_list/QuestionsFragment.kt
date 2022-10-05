package com.example.hemistry.presentation.questions.questions_list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hemistry.R
import com.example.hemistry.databinding.FragmentQuestionsBinding
import com.example.hemistry.databinding.FragmentTestBinding

class QuestionsFragment : Fragment() {
    private var _binding: FragmentQuestionsBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentQuestionsBinding.inflate(layoutInflater, container, false)
        binding.tvTest.setOnClickListener {
            findNavController().navigate(R.id.action_questionsFragment_to_testFragment)
        }
        return binding.root
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}