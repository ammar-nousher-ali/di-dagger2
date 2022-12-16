package com.example.dependencyinjectiondagger2

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRespository : UserRespository,
    private val emailService : EmailService
) {
    fun registerUser(email: String, password: String) {
        userRespository.saveUser()
        emailService.sendEmail(email, "demo@gmail.com", "User resgistered")

    }
}
