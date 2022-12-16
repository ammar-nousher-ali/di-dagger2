package com.example.dependencyinjectiondagger2

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor(){
    fun sendEmail(email: String, s: String, s1: String) {
        Log.d("TAG", "email sent")
    }
}