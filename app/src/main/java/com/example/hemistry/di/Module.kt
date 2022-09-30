package com.example.hemistry.di

import com.example.hemistry.data.RepositoryImpl
import com.example.hemistry.data.data.Elements
import com.example.hemistry.domain.repository.Repository
import com.example.hemistry.domain.use_case.GetElementListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object Module {

    @Provides
    fun provideRepo(elements : Elements): Repository = RepositoryImpl(elements)

    @Provides
    fun provideGetTableListUseCase(repository: Repository) = GetElementListUseCase(repository)

    @Provides
    fun provideElements() = Elements
}