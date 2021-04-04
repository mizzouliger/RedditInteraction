package com.reddit.restexample

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RedditInteraction

fun main(args: Array<String>) {
    println("this is inside the main function")
    SpringApplication.exit(runApplication<RedditInteraction>(*args))
}





