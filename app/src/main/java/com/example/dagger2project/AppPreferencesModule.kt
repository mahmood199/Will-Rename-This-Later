package com.example.dagger2project

import android.content.Context
import com.example.dagger2project.data.local.sharedPreference.AppPreferences
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

@Module
object AppPreferencesModule {

    @Provides
    @Singleton
    fun provideAppPreferences(context: Context) = AppPreferences(context)

}