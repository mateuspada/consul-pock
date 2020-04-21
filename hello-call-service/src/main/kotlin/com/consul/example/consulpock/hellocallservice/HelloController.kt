package com.consul.example.consulpock.hellocallservice

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(val helloServiceClient: HelloServiceClient) {

    @GetMapping
    fun hello(): HelloResponse {
        val helloServiceResponse = helloServiceClient.getValue()

        return HelloResponse(helloServiceResponse.value)
    }

}

data class HelloResponse(@JsonProperty("Hello") val hello: String)