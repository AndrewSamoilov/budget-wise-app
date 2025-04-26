package com.smv.budgetwiseapp.web

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/purchases")
class PurchaseController {


    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun create(): String {
        return """       
        { 
            "message": "purchase","
        }
    """
    }
}