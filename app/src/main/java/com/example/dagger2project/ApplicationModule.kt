package com.example.dagger2project

import com.example.dagger2project.models.User
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule {


    @Provides
    @UserName
    fun provideUserName(): String {
        return "Mahmood Ahmad"
    }

    @Provides
    @Password
    fun providePassword(): String {
        return "Password_69"
    }

}