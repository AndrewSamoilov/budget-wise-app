package com.smv.budgetwiseapp.auth.application.internal.outport

import com.smv.budgetwiseapp.auth.model.User

interface UserOutPort {
    fun save(email: String): User
    fun getByEmail(email: String): User?
}
