package com.smv.budgetwiseapp.auth.infrastructure.adapter

import com.smv.budgetwiseapp.auth.application.internal.outport.UserOutPort
import com.smv.budgetwiseapp.auth.model.User
import org.springframework.stereotype.Repository

@Repository
class UserRepository : UserOutPort {
    override fun save(email: String): User {
        TODO("Not yet implemented")
    }

    override fun getByEmail(email: String): User? {
        TODO("Not yet implemented")
    }
}