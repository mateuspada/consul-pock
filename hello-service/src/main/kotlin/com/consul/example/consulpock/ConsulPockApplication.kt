package com.consul.example.consulpock

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConsulPockApplication

fun main(args: Array<String>) {
    runApplication<ConsulPockApplication>(*args)
}
