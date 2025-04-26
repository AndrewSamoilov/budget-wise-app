package com.smv.budgetwiseapp.auth.config

import org.springframework.cglib.core.Customizer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.Customizer.withDefaults
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
class SecurityConfig {

    @Bean
    fun configure(http: HttpSecurity): SecurityFilterChain {
        return http.authorizeHttpRequests { auth ->
            auth.requestMatchers("/").permitAll();
            auth.anyRequest().authenticated()
        }.oauth2Login(withDefaults())
            .formLogin(withDefaults())
            .build()
    }
}
