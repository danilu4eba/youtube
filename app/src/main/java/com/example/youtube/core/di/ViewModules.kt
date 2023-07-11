package com.example.youtube.core.di

import com.example.youtube.ui.player.PlayerViewModel
import com.example.youtube.ui.playlists.PlaylistsViewModel
import com.example.youtube.ui.videos.VideosViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModules = module {
    viewModel{ PlaylistsViewModel(get()) }
    viewModel{ VideosViewModel(get()) }
    viewModel{ PlayerViewModel(get()) }
}
