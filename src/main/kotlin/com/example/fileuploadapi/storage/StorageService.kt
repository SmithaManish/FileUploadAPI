package com.example.fileuploadapi.storage
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Bean

import org.springframework.core.io.Resource
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile
import java.nio.file.Path
import java.util.stream.Stream

@Service

interface StorageService {
    fun init()
    fun store(file: MultipartFile?): Any
    fun loadAll(): Stream<Path?>?
    fun load(filename: String?): Path?
    fun loadAsResource(filename: String?): Resource?
    fun deleteAll()
}