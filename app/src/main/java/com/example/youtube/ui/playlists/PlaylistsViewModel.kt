package com.example.youtube.ui.playlists

import androidx.lifecycle.LiveData
import com.example.youtube.core.ui.BaseViewModel
import com.example.youtube.data.remote.model.Playlists
import com.example.youtube.core.network.result.Resource
import com.example.youtube.repository.Repository

class PlaylistsViewModel(private val repository: Repository) : BaseViewModel() {
    fun getPlayLists(): LiveData<Resource<Playlists>> {
        return repository.getPlayLists()
    }
}