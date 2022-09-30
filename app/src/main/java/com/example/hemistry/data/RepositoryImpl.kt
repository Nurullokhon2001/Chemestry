package com.example.hemistry.data

import com.example.hemistry.data.data.Elements
import com.example.hemistry.domain.model.ElementDetailsModel
import com.example.hemistry.domain.model.ElementListModel
import com.example.hemistry.domain.repository.Repository

class RepositoryImpl(
    private val elements: Elements
) : Repository {

    override fun getElementList(): List<ElementListModel> {
        return elements.getElements()
    }

    override fun getElementsById(id: Int): ElementListModel {
        return elements.getElementsById(id)
    }

    override fun getDetailsElementById(id: Int): ElementDetailsModel {
       return elements.getDetailsElementById(id)
    }
}