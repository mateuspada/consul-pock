package com.consul.example.consulpock.hellocallservice

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping

@FeignClient("consul-hello-service", fallback = HelloServiceFallback::class)
interface HelloServiceClient {
    @GetMapping("/value")
    fun getValue(): ValueResponse
}

@Component
class HelloServiceFallback : HelloServiceClient {
    override fun getValue(): ValueResponse {
        return ValueResponse("Hystrix Value")
    }
}

data class ValueResponse(@JsonProperty("Value") val value: String)