package com.example.stylescopeproject.domain.model.password


data class ResetPasswordModel(
    val email: String
)

data class ResetPasswordConfirmModel(
    val code: String,
    val newPassword: String,
    val newPassword2: String
)
