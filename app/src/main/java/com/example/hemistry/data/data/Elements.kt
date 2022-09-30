package com.example.hemistry.data.data

import com.example.hemistry.domain.model.ElementListModel

object Elements {
    private val list = mutableListOf<ElementListModel>()
    fun getElements(): List<ElementListModel> {
        list.add(ElementListModel(1, "Гидроген", "1.00794±7", 1, "H", "VII"))
        list.add(ElementListModel(2, "Гелий", "4.002602±2", 1, "He", "VIII"))
        list.add(ElementListModel(3, "Литий", "6.941±2", 1, "Li", "I"))
        list.add(ElementListModel(4, "Бериллий", "9.01218±1", 1, "Be", "II"))
        list.add(ElementListModel(5, "Бор", "10.811±5", 2, "B", "III"))
        list.add(ElementListModel(6, "Карбон", "9.01218±1", 2, "C", "IV"))
        list.add(ElementListModel(7, "Нитроген", "14.0067±1", 2, "N", "V"))
        list.add(ElementListModel(8, "Оксиген", "15.9994±3", 2, "O", "VI"))
        list.add(ElementListModel(9, "Фтор", "18.998403±1", 2, "F", "VII"))
        list.add(ElementListModel(10, "Неон", "20.179±1", 2, "Ne", "VIII"))
        return list
    }

    fun getElementsById(id: Int): ElementListModel {
        val position = getElements().indexOfFirst { it.id == id }
        return getElements()[position]
    }

}