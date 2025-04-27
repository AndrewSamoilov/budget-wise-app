package com.smv.budgetwiseapp.auth.model

import kotlinx.datetime.LocalDateTime


data class UserModel(
    val email: String,
    val createdAt: LocalDateTime,
    val deletedAt: LocalDateTime?
)
