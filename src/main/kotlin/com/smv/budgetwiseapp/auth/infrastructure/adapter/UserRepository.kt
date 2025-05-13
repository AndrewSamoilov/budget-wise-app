package com.smv.budgetwiseapp.auth.infrastructure.adapter

import com.smv.budgetwiseapp.auth.application.internal.outport.UserOutPort
import com.smv.budgetwiseapp.auth.infrastructure.entity.User
import com.smv.budgetwiseapp.auth.model.UserModel
import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toJavaLocalDateTime
import kotlinx.datetime.toLocalDateTime
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq
import org.jetbrains.exposed.sql.insert

import org.jetbrains.exposed.sql.transactions.transaction
import org.springframework.beans.factory.config.BeanPostProcessor
import org.springframework.stereotype.Repository

@Repository
class UserRepository : UserOutPort {
    override fun save(email: String): UserModel {
        BeanPostProcessor
        val user = transaction {
            User.insert {
                it[User.email] = email
                it[User.createdAt] = Clock.System.now()
                    .toLocalDateTime(TimeZone.UTC)
            }.resultedValues!!.single().toUserModel()
        }
        return user
    }

    override fun getByEmail(email: String): UserModel? {
        return transaction {
            User.select().singleOrNull()?.toUserModel()
        }
    }

    fun ResultRow.toUserModel() = UserModel(
        email = this[User.email],
        createdAt = this[User.createdAt],
        deletedAt = this[User.deletedAt]
    )
}