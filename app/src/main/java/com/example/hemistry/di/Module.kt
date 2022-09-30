package com.example.hemistry.di

import com.example.hemistry.data.RepositoryImpl
import com.example.hemistry.domain.repository.Repository
import com.example.hemistry.domain.use_case.GetTableListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object Module {

    @Provides
    fun provideRepo(): Repository = RepositoryImpl()

    @Provides
    fun provideGetTableListUseCase(repository: Repository) = GetTableListUseCase(repository)
}