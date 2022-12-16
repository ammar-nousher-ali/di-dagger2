package com.example.dependencyinjectiondagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userRegistrationService = DaggerUserRegisterationComponent.builder().build().getUserRegistrationService()

        userRegistrationService.registerUser("demo@gmail.com","112121")
    }
}