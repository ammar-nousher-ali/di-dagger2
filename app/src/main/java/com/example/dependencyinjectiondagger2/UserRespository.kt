package com.example.dependencyinjectiondagger2

import android.util.Log
import javax.inject.Inject

class UserRespository @Inject constructor() {
    fun saveUser() {
        Log.d("TAG", "user saved in db")
    }
}