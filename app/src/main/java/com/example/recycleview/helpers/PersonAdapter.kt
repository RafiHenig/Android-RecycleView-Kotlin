package com.example.recycleview.helpers

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.databinding.ListItemViewBinding
import com.example.recycleview.ui.main.Person
import com.example.recycleview.BR.person

class PersonAdapter() : RecyclerView.Adapter<PersonAdapter.ListItemViewHolder>() {
    override fun getItemCount(): Int {
        return values.size;
    }

    var values = listOf<Person>()
        set(data) {
            field = data
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListItemViewHolder {
        return ListItemViewHolder(
            ListItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ListItemViewHolder, position: Int) {
        var value = values[position];
        holder.bind(value)
    }

    inner class ListItemViewHolder(
        private val binding: ListItemViewBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Person) {

            binding.setVariable(person,item)

            binding.executePendingBindings()

        }
    }
}


