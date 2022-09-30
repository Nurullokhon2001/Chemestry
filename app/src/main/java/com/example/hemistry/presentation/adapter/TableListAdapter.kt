package com.example.hemistry.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.hemistry.R
import com.example.hemistry.databinding.ItemTableListBinding
import com.example.hemistry.domain.model.TableListModel
import com.example.hemistry.presentation.adapter.TableListAdapter.*

class TableListAdapter : ListAdapter<TableListModel, ViewHolder>(ItemCallback) {
    class ViewHolder(private val binding: ItemTableListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun setData(model: TableListModel) {
            with(binding) {
                tableName.text = model.name
                tableId.text = model.id.toString()
                tableWeight.text = model.weight
                alphabet.text = model.alphabet
                tableGroup.text= model.group
                when (model.category) {
                    1 -> alphabet.setTextColor(setColors(R.color.s_elements))
                    2 -> alphabet.setTextColor(setColors(R.color.p_elements))
                    3 -> alphabet.setTextColor(setColors(R.color.d_elements))
                    4 -> alphabet.setTextColor(setColors(R.color.f_elements))
                }
            }
        }

        private fun setColors(color: Int): Int {
            return binding.tableId.context.getColor(color)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemTableListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData(getItem(position))
    }


    object ItemCallback : DiffUtil.ItemCallback<TableListModel>() {
        override fun areItemsTheSame(oldItem: TableListModel, newItem: TableListModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: TableListModel, newItem: TableListModel): Boolean {
            return oldItem == newItem
        }
    }
}