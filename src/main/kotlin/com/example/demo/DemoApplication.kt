package com.example.demo

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}

@RestController
class MainController(
    @Value("\${spring.devtools.remote.secret}") val secret: String
) {

    @GetMapping("/")
    fun home(): String {
        return "ТЕСТ НА вв1111ДЕБ1111АГ = $secret; Ctrl + F9"
    }

}