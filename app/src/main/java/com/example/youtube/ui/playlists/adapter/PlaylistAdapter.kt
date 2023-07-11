package com.example.youtube.ui.playlists.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.youtube.core.ext.loadImage
import com.example.youtube.data.remote.model.Item
import com.example.youtube.databinding.PlaylistItemBinding


class PlaylistAdapter(val onCLick: (item: Item) -> Unit) :
    RecyclerView.Adapter<PlaylistAdapter.PlaylistViewHolder>() {
    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<Item>) {
        this.list = list as ArrayList<Item>
        notifyDataSetChanged()
    }

    private var list = arrayListOf<Item>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {
        return PlaylistViewHolder(
            PlaylistItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class PlaylistViewHolder(private val binding: PlaylistItemBinding) :
        ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun bind(item: Item) {
            binding.videoIv.loadImage(item.snippet.thumbnails.default.url)
            binding.titleTv.text = item.snippet.title
            binding.seriesTv.text = "${item.contentDetails.itemCount} video series"
            binding.item.setOnClickListener {
                onCLick.invoke(item)
            }
        }
    }
}

