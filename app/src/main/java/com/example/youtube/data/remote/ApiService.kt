package com.example.youtube.data.remote

import com.example.youtube.data.remote.model.PlaylistItem
import com.example.youtube.data.remote.model.Playlists
import com.example.youtube.data.remote.model.Video
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("playlists")
    suspend fun getPlayLists(
        @Query("key") key:String,
        @Query("part") part:String,
        @Query("channelId") channelId: String,
        @Query("maxResults") maxResults : Int = 20
    ) : Response<Playlists>
    @GET("playlistItems")

    suspend fun getPlaylistItems(
        @Query("key") key : String,
        @Query("part") part : String,
        @Query("playlistId") channelId : String,
        @Query("maxResults") maxResults : Int = 20,

    ) : Response<PlaylistItem>

    @GET("videos")
    suspend fun getVideo(
        @Query("key") key: String,
        @Query("part") part: String,
        @Query("id") id: String,
        @Query("maxResults") maxResults : Int = 20,
    ): Response<Video>
}