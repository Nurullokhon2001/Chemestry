package com.example.hemistry.domain.use_case

import com.example.hemistry.domain.model.ElementDetailsModel
import com.example.hemistry.domain.repository.Repository
import javax.inject.Inject

class GetDetailsElementByIdUseCase @Inject constructor(
    private val repository: Repository
) {
    operator fun invoke(id: Int): ElementDetailsModel {
        return repository.getDetailsElementById(id)
    }
}