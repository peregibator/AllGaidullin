package com.example.mobiledevelopmentcourselabapp.di.module

import com.example.mobiledevelopmentcourselabapp.domain.repository.IChuckRepository
import dagger.Module
import dagger.Provides

@Module

class RepositoryModule {
    @Provides
    fun chukrepository(repository: IChuckRepository):IChuckRepository {
        return repository
    }
}