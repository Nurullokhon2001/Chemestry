package com.example.hemistry.presentation.questions.test

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hemistry.domain.model.Question
import com.example.hemistry.domain.use_case.GetQuestionsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TestViewModel @Inject constructor(
    private val getQuestionsUseCase: GetQuestionsUseCase
) : ViewModel() {
    fun getQuestions(): LiveData<List<Question>> {
        val question = MutableLiveData<List<Question>>()
        question.value = getQuestionsUseCase.invoke()
        return question
    }
}