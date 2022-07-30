package com.example.dagger2project.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class User(
    val username: String = "Mahmood",
    val password: String = "Password_69"
) : Parcelable {

}