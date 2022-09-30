package com.example.hemistry.data

import com.example.hemistry.domain.model.TableListModel
import com.example.hemistry.domain.repository.Repository
class RepositoryImpl : Repository {
    override fun getTableList(): List<TableListModel> {
        val list = mutableListOf<TableListModel>()
        list.add(TableListModel(1, "Гидроген", "1.00794±7", 1, "H","VII"))
        list.add(TableListModel(2, "Гелий", "4.002602±2", 1, "He","VIII"))
        list.add(TableListModel(3, "Литий", "6.941±2", 1, "Li","I"))
        list.add(TableListModel(4, "Бериллий", "9.01218±1", 1, "Be","II"))
        list.add(TableListModel(5, "Бор", "10.811±5", 2, "B","III"))
        list.add(TableListModel(6, "Карбон", "9.01218±1", 2, "C","IV"))
        list.add(TableListModel(7, "Нитроген", "14.0067±1", 2, "N","V"))
        list.add(TableListModel(8, "Оксиген", "15.9994±3", 2, "O","VI"))
        list.add(TableListModel(9, "Фтор", "18.998403±1", 2, "F","VII"))
        list.add(TableListModel(10, "Неон", "20.179±1", 2, "Ne","VIII"))
        return list
    }
}