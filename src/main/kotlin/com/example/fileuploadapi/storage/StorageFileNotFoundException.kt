package com.example.fileuploadapi.storage

import com.example.fileuploadapi.storage.StorageException

class StorageFileNotFoundException : StorageException {
    constructor(message: String?) : super(message) {}
    constructor(message: String?, cause: Throwable?) : super(message, cause) {}
}