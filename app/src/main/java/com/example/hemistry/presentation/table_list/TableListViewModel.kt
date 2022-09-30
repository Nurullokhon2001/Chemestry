package com.example.hemistry.presentation.table_list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hemistry.domain.model.TableListModel
import com.example.hemistry.domain.use_case.GetTableListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TableListViewModel @Inject constructor(
   private val getTableListUseCase: GetTableListUseCase
) : ViewModel() {

    fun getTableList(): LiveData<List<TableListModel>> {
        val list = MutableLiveData<List<TableListModel>>()
        list.value = getTableListUseCase()
        return list
    }
}