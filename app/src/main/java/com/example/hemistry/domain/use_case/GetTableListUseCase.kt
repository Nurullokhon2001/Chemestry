package com.example.hemistry.domain.use_case

import com.example.hemistry.domain.model.TableListModel
import com.example.hemistry.domain.repository.Repository
import javax.inject.Inject

class GetTableListUseCase @Inject constructor( val repository: Repository) {
    operator fun invoke(): List<TableListModel> {
        return repository.getTableList()
    }
}