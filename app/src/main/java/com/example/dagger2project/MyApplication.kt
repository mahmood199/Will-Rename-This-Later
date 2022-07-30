package com.example.dagger2project

import android.app.Application
import android.util.Log
import android.widget.Toast
import com.example.dagger2project.models.User
import javax.inject.Inject

class MyApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent
    companion object {
        private const val TAG = "MyApplication"
    }

    @Inject
    lateinit var user : User

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.builder().build()
        applicationComponent.inject(this)
        Log.i(TAG, "onCreate: ${user.username} ${user.password}")
        Toast.makeText(this, "${user.username} ${user.password}", Toast.LENGTH_SHORT).show()
    }



}