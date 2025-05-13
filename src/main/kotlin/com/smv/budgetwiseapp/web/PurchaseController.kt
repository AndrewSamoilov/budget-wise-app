package com.smv.budgetwiseapp.web

import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.security.oauth2.core.user.OAuth2User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/purchases")
class PurchaseController {


    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun create(@AuthenticationPrincipal u: OAuth2User): String {
        return """       
        { 
            "message": "purchase","
        }
    """
    }
}