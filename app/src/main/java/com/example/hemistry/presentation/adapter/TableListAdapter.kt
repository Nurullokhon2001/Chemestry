package com.example.hemistry.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.hemistry.R
import com.example.hemistry.databinding.ItemTableListBinding
import com.example.hemistry.domain.model.ElementListModel
import com.example.hemistry.presentation.adapter.TableListAdapter.*

class TableListAdapter(
   private val tableListClickListener: (Int) -> Unit
) : ListAdapter<ElementListModel, ViewHolder>(ItemCallback) {
    inner class ViewHolder(private val binding: ItemTableListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun setData(model: ElementListModel) {
            with(binding) {
                tableName.text = model.name
                tableId.text = model.id.toString()
                tableWeight.text = model.weight
                alphabet.text = model.alphabet
                tableGroup.text = model.group
                when (model.category) {
                    1 -> alphabet.setTextColor(setColors(R.color.s_elements))
                    2 -> alphabet.setTextColor(setColors(R.color.p_elements))
                    3 -> alphabet.setTextColor(setColors(R.color.d_elements))
                    4 -> alphabet.setTextColor(setColors(R.color.f_elements))
                }
                binding.root.setOnClickListener {
                    tableListClickListener.invoke(model.id)
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


    object ItemCallback : DiffUtil.ItemCallback<ElementListModel>() {
        override fun areItemsTheSame(oldItem: ElementListModel, newItem: ElementListModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ElementListModel, newItem: ElementListModel): Boolean {
            return oldItem == newItem
        }
    }
}