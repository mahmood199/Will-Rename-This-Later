package com.example.dagger2project

import java.lang.annotation.RetentionPolicy
import javax.inject.Scope


@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ApplicationContext {
}