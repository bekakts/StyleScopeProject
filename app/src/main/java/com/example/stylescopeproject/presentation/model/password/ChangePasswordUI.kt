package com.example.stylescopeproject.presentation.model.password

data class ChangePasswordUI(
    val oldPassword: String,
    val newPassword: String
)

data class ResendResetCodeUI(
    val email: String
)
