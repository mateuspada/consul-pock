package com.consul.example.consulpock

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping
    fun sayHello(): HelloResponse {
        return HelloResponse()
    }
}

data class HelloResponse(@JsonProperty("Hello") val hello: String = "World")