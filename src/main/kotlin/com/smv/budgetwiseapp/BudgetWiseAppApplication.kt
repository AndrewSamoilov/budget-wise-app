package com.smv.budgetwiseapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity

@EnableWebSecurity
@SpringBootApplication
class BudgetWiseAppApplication

fun main(args: Array<String>) {
    runApplication<BudgetWiseAppApplication>(*args)
}
