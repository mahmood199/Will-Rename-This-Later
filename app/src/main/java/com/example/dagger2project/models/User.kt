package com.example.dagger2project.models

import com.example.dagger2project.Password
import com.example.dagger2project.UserName
import javax.inject.Inject


data class User @Inject constructor(
    @UserName val username: String,
    @Password val password: String
) {

}