package com.example.dagger2project.di

import android.content.Context
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.example.dagger2project.ApplicationContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class GlideModule {

    @Provides
    @Singleton
    fun provideGlideRequestManager(@ApplicationContext context: Context) = Glide.with(context)


}