package com.migc.di

import com.migc.repository.HeroRepository
import com.migc.repository.HeroRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
}