package com.example.dependencyinjectiondagger2

import dagger.Component

@Component
interface UserRegisterationComponent {

    fun getUserRegistrationService(): UserRegistrationService
}