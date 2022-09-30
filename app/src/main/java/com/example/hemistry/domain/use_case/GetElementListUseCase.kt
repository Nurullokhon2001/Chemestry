package com.example.hemistry.domain.use_case

import com.example.hemistry.domain.model.ElementListModel
import com.example.hemistry.domain.repository.Repository
import javax.inject.Inject

class GetElementListUseCase @Inject constructor(val repository: Repository) {
    operator fun invoke(): List<ElementListModel> {
        return repository.getElementList()
    }
}