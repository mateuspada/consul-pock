package com.consul.example.consulpock.helloservice

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class HelloController(val property: Property) {

    @GetMapping("/property")
    fun getProperty(): ValueResponse {
        return ValueResponse(property.value)
    }

    @GetMapping("/value")
    fun getRandomValue(): ValueResponse {
        return ValueResponse()
    }
}

object Value {
    val random = UUID.randomUUID().toString()
}

data class ValueResponse(@JsonProperty("Value") val value: String = Value.random)