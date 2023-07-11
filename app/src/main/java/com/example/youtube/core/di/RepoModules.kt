package com.example.youtube.core.di

import com.example.youtube.repository.Repository
import org.koin.dsl.module

val repoModules = module {
    single { Repository(get()) }
}