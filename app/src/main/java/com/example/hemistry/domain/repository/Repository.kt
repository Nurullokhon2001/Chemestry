package com.example.hemistry.domain.repository

import com.example.hemistry.domain.model.ElementDetailsModel
import com.example.hemistry.domain.model.ElementListModel

interface Repository {
    fun getElementList(): List<ElementListModel>
    fun getElementsById(id : Int):ElementListModel
    fun getDetailsElementById(id : Int):ElementDetailsModel
}