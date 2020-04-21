package com.consul.example.consulpock.hellocallservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.hystrix.EnableHystrix
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
class HeloCallServiceApplication

fun main(args: Array<String>) {
    runApplication<HeloCallServiceApplication>(*args)
}
