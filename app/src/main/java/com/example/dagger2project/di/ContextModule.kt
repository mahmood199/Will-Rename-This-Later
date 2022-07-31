package com.example.dagger2project.di

import android.content.Context
import dagger.Module
import dagger.Provides


@Module
class ContextModule(val context: Context) {

    @Provides
    fun provideApplicationContext() = context.applicationContext

}