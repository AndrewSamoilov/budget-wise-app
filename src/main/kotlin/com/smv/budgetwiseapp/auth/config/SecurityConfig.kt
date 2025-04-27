package com.smv.budgetwiseapp.auth.config

import com.smv.budgetwiseapp.auth.application.internal.service.impl.UserServiceImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.Customizer.withDefaults
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
class SecurityConfig(private val userServiceImpl: UserServiceImpl) {

    @Bean
    fun configure(http: HttpSecurity): SecurityFilterChain {
        return http.authorizeHttpRequests { auth ->
            auth.requestMatchers("/").permitAll();
            auth.anyRequest().authenticated()
        }
            .oauth2Login { oauth2 ->
                oauth2.userInfoEndpoint { infoEndpoint ->
                    infoEndpoint.userService(userServiceImpl) } }
            .formLogin(withDefaults())
            .build()
    }
}
