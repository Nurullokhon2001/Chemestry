package com.example.hemistry.domain.repository

import com.example.hemistry.domain.model.TableListModel

interface Repository {
    fun getTableList(): List<TableListModel>
}