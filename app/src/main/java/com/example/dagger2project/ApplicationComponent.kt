package com.example.dagger2project

import dagger.Component
import javax.inject.Singleton

@Component
interface ApplicationComponent {

    fun inject(myApplication: MyApplication)


}