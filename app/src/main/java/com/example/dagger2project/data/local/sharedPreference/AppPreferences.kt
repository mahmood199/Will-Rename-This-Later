package com.example.dagger2project.data.local.sharedPreference

import android.content.Context
import android.content.SharedPreferences
import javax.inject.Inject

class AppPreferences @Inject constructor(private val context: Context) {

    companion object {
        private const val USER_DATA = "USER_DATA"
        private const val MODE = Context.MODE_PRIVATE
    }


    private val userPreferences: SharedPreferences = context.getSharedPreferences(USER_DATA, MODE)


    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editor = edit()
        operation(editor)
        editor.apply()
    }


}