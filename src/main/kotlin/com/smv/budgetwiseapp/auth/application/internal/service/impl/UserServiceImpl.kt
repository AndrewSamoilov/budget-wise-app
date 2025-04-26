package com.smv.budgetwiseapp.auth.application.internal.service.impl

import com.smv.budgetwiseapp.auth.application.internal.outport.UserOutPort
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest
import org.springframework.security.oauth2.core.user.OAuth2User
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(private val userOutPort: UserOutPort) : DefaultOAuth2UserService() {

    override fun loadUser(userRequest: OAuth2UserRequest): OAuth2User {

        val auth2User = super.loadUser(userRequest)

        return auth2User;
    }
}
