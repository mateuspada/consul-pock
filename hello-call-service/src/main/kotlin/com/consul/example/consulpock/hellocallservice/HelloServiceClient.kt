package com.consul.example.consulpock.hellocallservice

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient("consul-hello-service")
interface HelloServiceClient{
    @GetMapping("/name")
    fun getName(): NameResponse
}

data class NameResponse(@JsonProperty("Name") val name: String = "Mateus")