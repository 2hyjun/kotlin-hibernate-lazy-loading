package org.josh.allopen

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AllOpenApplication

fun main(args: Array<String>) {
    runApplication<AllOpenApplication>(*args)
}
