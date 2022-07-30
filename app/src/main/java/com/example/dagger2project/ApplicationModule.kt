package com.example.dagger2project

import com.example.dagger2project.models.User
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule {

    @Provides
    @Singleton
    fun provideUser(): User {
        return User()
    }

}