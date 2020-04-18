package com.consul.example.consulpock.helloservice

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class NameController {

    @GetMapping("/name")
    fun sayName(): NameResponse {
        return NameResponse()
    }
}

object Name {
    val name = UUID.randomUUID().toString()
}

data class NameResponse(@JsonProperty("Name") val name: String = Name.name)