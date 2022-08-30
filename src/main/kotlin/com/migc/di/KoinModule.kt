package com.migc.di

import com.migc.repository.HeroRepository
import com.migc.repository.HeroRepositoryAlternative
import com.migc.repository.HeroRepositoryImpl
import com.migc.repository.HeroRepositoryImplAlternative
import org.koin.dsl.module

val koinModule = module {
    single<HeroRepository> {
        HeroRepositoryImpl()
    }
    single<HeroRepositoryAlternative> {
        HeroRepositoryImplAlternative()
    }
}