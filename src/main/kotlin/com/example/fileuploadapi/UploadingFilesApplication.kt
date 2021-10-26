package com.example.fileuploadapi

import com.example.fileuploadapi.storage.StorageProperties
import com.example.fileuploadapi.storage.StorageService
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean


@SpringBootApplication
@EnableConfigurationProperties(StorageProperties::class)
class UploadingFilesApplication {
    @Bean
    fun init(storageService: StorageService): CommandLineRunner {
        return CommandLineRunner {
            storageService.deleteAll()
            storageService.init()
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(UploadingFilesApplication::class.java, *args)
        }
    }
}
