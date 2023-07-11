package com.example.youtube.data.remote


import com.example.youtube.BuildConfig
import com.example.youtube.core.network.BaseDataSource
import com.example.youtube.core.network.result.Resource
import com.example.youtube.data.remote.model.PlaylistItem
import com.example.youtube.data.remote.model.Playlists
import com.example.youtube.data.remote.model.Video
import com.example.youtube.utils.Const
import org.koin.dsl.module

val remoteDataSource = module {
    factory { RemoteDataSource(get()) }
}

class RemoteDataSource(private val apiService: ApiService) : BaseDataSource() {

    suspend fun getPlayLists(): Resource<Playlists> = getResult {
        apiService.getPlayLists(BuildConfig.API_KEY, Const.part, Const.channelId)
    }

    suspend fun getPlaylistItems(playlistId: String, itemCount: Int): Resource<PlaylistItem> {
        return getResult {
            apiService.getPlaylistItems(
                BuildConfig.API_KEY,
                Const.part,
                playlistId,
                itemCount
            )
        }
    }

    suspend fun getVideo(id: String): Resource<Video> {
       return getResult {
            apiService.getVideo(
                BuildConfig.API_KEY,
                Const.part,
                id
            )
        }
    }
}
