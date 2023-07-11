package com.example.youtube.repository


import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.example.youtube.core.network.result.Resource
import com.example.youtube.data.remote.RemoteDataSource
import com.example.youtube.data.remote.model.PlaylistItem
import com.example.youtube.data.remote.model.Playlists
import com.example.youtube.data.remote.model.Video
import kotlinx.coroutines.Dispatchers

class Repository(private val dataSource: RemoteDataSource) {


    fun getPlayLists(): LiveData<Resource<Playlists>> = liveData(Dispatchers.IO) {
        emit(Resource.loading())
        val response = dataSource.getPlayLists()
        emit(
            response
        )
    }
    fun getVideos(playlistId: String, itemCount: Int): LiveData<Resource<PlaylistItem>> =
        liveData(Dispatchers.IO) {
            emit(Resource.loading())
            val response = dataSource.getPlaylistItems(playlistId, itemCount)
            emit(response)
        }

    fun getVideo(id: String): LiveData<Resource<Video>> {
        return liveData(Dispatchers.IO) {
            emit(Resource.loading())
            val response = dataSource.getVideo(id)
            emit(response)
        }
    }
}