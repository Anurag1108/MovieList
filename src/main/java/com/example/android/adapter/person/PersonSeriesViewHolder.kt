package com.example.android.adapter.person

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.databinding.PersonSeriesItemBinding
import com.example.android.model.person.PersonTvCast

class PersonSeriesViewHolder(private val binding: PersonSeriesItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: PersonTvCast?, clickListener: PersonSeriesClickListener) {
        binding.series = item
        binding.clicklistener = clickListener
        binding.executePendingBindings()
    }

    companion object {
        fun from(parent: ViewGroup): PersonSeriesViewHolder {

            val inflater = LayoutInflater.from(parent.context)
            val binding = PersonSeriesItemBinding.inflate(inflater, parent, false)

            return PersonSeriesViewHolder(binding)
        }
    }

}