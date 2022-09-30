package com.example.hemistry.domain.use_case

import com.example.hemistry.domain.repository.Repository
import javax.inject.Inject

class GetElementsByIdUseCase @Inject constructor(
    private val repository: Repository
) {
    operator fun invoke(id: Int) = repository.getElementsById(id)
}