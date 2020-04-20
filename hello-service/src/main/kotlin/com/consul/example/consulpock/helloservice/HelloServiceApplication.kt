package com.consul.example.consulpock.helloservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(Property::class)
class HelloServiceApplication

fun main(args: Array<String>) {
    runApplication<HelloServiceApplication>(*args)
}
