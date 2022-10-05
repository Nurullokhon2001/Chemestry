package com.example.hemistry.domain.use_case

import com.example.hemistry.domain.model.Question
import com.example.hemistry.domain.repository.Repository
import javax.inject.Inject

class GetQuestionsUseCase @Inject constructor(
    private val repository: Repository
) {
    operator fun invoke(): List<Question> {
        return repository.getQuestions()
    }
}