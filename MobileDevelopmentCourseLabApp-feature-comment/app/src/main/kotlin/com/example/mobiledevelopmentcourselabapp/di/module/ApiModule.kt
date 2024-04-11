package com.example.mobiledevelopmentcourselabapp.di.module

import com.example.mobiledevelopmentcourselabapp.data.api.ChuckApi
import com.example.mobiledevelopmentcourselabapp.data.provider.ChuckApiProvider
import dagger.Module
import dagger.Provides
@Module
class ApiModule {
    @Provides
    fun ChuckApiProvider(provider: ChuckApiProvider):ChuckApi {
        return provider.chuckApi
    }
}