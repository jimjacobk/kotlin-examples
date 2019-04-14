package org.jetbrains.kotlin.demo

import com.aexp.cbp.entity.Client
import com.aexp.cbp.repository.ClientRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@ComponentScan(basePackages = arrayOf("com.aexp.cbp.*"))
@EnableJpaRepositories("com.aexp.cbp.*")
@EntityScan("com.aexp.cbp.*")
class Application

fun main(args: Array<String>) {

    SpringApplication.run(Application::class.java, *args)
}