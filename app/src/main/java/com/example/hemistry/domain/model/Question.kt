package com.example.hemistry.domain.model

data class Question(
    val id: Int,
    val question: String,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val correctOption: Int

)

