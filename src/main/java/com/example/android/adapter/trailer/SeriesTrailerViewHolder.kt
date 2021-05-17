package com.example.android.adapter.trailer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android.databinding.SeriesTrailersItemBinding
import com.example.android.model.tv.TvTrailer

class SeriesTrailerViewHolder(private val binding: SeriesTrailersItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: TvTrailer?, clickListener: TrailerClickListener) {
        binding.trailer = item
        binding.clickListener = clickListener
        binding.executePendingBindings()
    }

    companion object {
        fun from(parent: ViewGroup): SeriesTrailerViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val binding = SeriesTrailersItemBinding.inflate(inflater, parent, false)

            return SeriesTrailerViewHolder(binding)
        }
    }

}