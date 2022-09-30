package com.example.hemistry.presentation.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hemistry.domain.model.ElementListModel
import com.example.hemistry.domain.use_case.GetElementsByIdUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(
    private val getElementsByIdUseCase: GetElementsByIdUseCase
) : ViewModel() {

    fun getElementsById(id: Int): LiveData<ElementListModel> {
        val element = MutableLiveData<ElementListModel>()
        element.value = getElementsByIdUseCase.invoke(id)
        return element
    }
}