package com.consul.example.consulpock.helloservice

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class NameController(val property: Property) {

    @GetMapping("/name")
    fun sayName(): NameResponse {
        return NameResponse(property.value)
    }
}

object Name {
    val name = UUID.randomUUID().toString()
}

data class NameResponse(@JsonProperty("Name") val name: String = Name.name)