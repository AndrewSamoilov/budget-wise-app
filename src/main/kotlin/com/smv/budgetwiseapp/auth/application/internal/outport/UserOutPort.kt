package com.smv.budgetwiseapp.auth.application.internal.outport

import com.smv.budgetwiseapp.auth.model.UserModel

interface UserOutPort {
    fun save(email: String): UserModel
    fun getByEmail(email: String): UserModel?
}
