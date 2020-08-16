package com.raywenderlich.android.majesticreader.data

import com.raywenderlich.android.majesticreader.domain.Document

interface DocumentDataSource {

    suspend fun add(document: Document)

    suspend fun read(): List<Document>

    suspend fun remove(document: Document)
}