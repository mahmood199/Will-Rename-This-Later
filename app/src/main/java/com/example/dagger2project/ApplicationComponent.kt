package com.example.dagger2project

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, AppPreferencesModule::class])
interface ApplicationComponent {

    fun inject(myApplication: MyApplication)


}