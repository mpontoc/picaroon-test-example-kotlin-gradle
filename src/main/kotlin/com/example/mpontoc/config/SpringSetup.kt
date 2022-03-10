package com.example.mpontoc.config

import io.cucumber.spring.CucumberContextConfiguration
import org.springframework.boot.test.context.SpringBootContextLoader
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@CucumberContextConfiguration
@ActiveProfiles("test")
@SpringBootTest(
    classes = [ConfigInit::class, SpringBootContextLoader::class]
)
class SpringSetup {
    init {
        println("Iniciando o Spring")
    }
}
