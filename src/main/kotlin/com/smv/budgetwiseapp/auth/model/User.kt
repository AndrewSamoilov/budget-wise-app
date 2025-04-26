package com.smv.budgetwiseapp.auth.model

import java.time.LocalDateTime

data class User(
    val email: String,
    val createdAt: LocalDateTime,
    val deletedAt: LocalDateTime?
)
