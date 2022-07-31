package com.example.dagger2project

import javax.inject.Qualifier
import javax.inject.Scope

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class UserName()


@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Password()
