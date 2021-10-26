package com.example.fileuploadapi.storage

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
@ConfigurationProperties(prefix = "storage")
class StorageProperties {
var location="upload-dir"

     fun getLocation1(): String? {
        return location
    }
    fun setLocation1(location: String?) {
        this.location = location!!
    }


    /**
     * Folder location for storing files
     */

}