package com.example.hemistry.presentation.element_list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hemistry.domain.model.ElementListModel
import com.example.hemistry.domain.use_case.GetElementListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ElementListViewModel @Inject constructor(
   private val getElementListUseCase: GetElementListUseCase
) : ViewModel() {

    fun getTableList(): LiveData<List<ElementListModel>> {
        val list = MutableLiveData<List<ElementListModel>>()
        list.value = getElementListUseCase()
        return list
    }
}