package com.smv.budgetwiseapp.auth.infrastructure.entity


import kotlinx.coroutines.runBlocking
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.SqlExpressionBuilder.eq
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.kotlin.datetime.datetime
import org.jetbrains.exposed.sql.transactions.transaction

object User : Table("user") {
    val id = integer("id").autoIncrement()
    val email = varchar("email", 225)
    val createdAt = datetime("created_at")
    val deletedAt = datetime("deleted_at").nullable()


    override val primaryKey = PrimaryKey(id)
}