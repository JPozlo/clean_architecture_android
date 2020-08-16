package com.raywenderlich.android.majesticreader.data

import com.raywenderlich.android.majesticreader.domain.Document

class DocumentRepository(private val dataSource: DocumentDataSource, private val openDocumentDataSource: OpenDocumentDataSource) {

    suspend fun addDocument(document: Document) = dataSource.add(document)

    suspend fun getDocuments() = dataSource.read()

    suspend fun deleteDocument(document: Document) = dataSource.remove(document)

    suspend fun setOpenDocument(document: Document) = openDocumentDataSource.setOpenDocument(document)

    suspend fun getOpenDocument() = openDocumentDataSource.getOpenDocument()

}