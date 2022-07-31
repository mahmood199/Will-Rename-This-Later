package com.example.dagger2project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.dagger2project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.tv.text = (application as MyApplication).user.username
        val userName = (application as MyApplication).user.username
        val password = (application as MyApplication).user.password

        Toast.makeText(this, "$userName\n$password", Toast.LENGTH_SHORT).show()
    }
}