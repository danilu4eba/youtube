package com.example.youtube.data.remote.model

data class Playlists(
    val etag: String,
    val items: List<Item>,
    val kind: String,
    val nextPageToken: String,
    val pageInfo: PageInfo
)

data class PlaylistItem(
    val items: List<Item>,
)

data class ContentDetails(
    val itemCount: Int = 20,
    val videoId : String
)

data class Default(
    val height: Int,
    val url: String,
    val width: Int
)

data class PlaylistInfo(
    val id : String,
    val title : String,
    val desc : String,
    val itemCount : Int
) : java.io.Serializable

data class High(
    val height: Int,
    val url: String,
    val width: Int
)

data class Item(
    val contentDetails: ContentDetails,
    val etag: String,
    val id: String,
    val kind: String,
    val snippet: Snippet
) : java.io.Serializable


data class Localized(
    val description: String,
    val title: String
)

data class Maxres(
    val height: Int,
    val url: String,
    val width: Int
)

data class Medium(
    val height: Int,
    val url: String,
    val width: Int
)

data class PageInfo(
    val resultsPerPage: Int,
    val totalResults: Int
)

data class Snippet(
    val channelId: String,
    val channelTitle: String,
    val description: String,
    val localized: Localized,
    val publishedAt: String,
    val thumbnails: Thumbnails,
    val title: String
)

data class Standard(
    val height: Int,
    val url: String,
    val width: Int
)

data class Thumbnails(
    val default: Default,
    val high: High,
    val maxres: Maxres,
    val medium: Medium,
    val standard: Standard
)
data class Video(
    val items: List<Items>
)
data class Items(
    val contentDetails: ContentDetails
) {
    data class ContentDetails(
        val duration: String,
    )
}
