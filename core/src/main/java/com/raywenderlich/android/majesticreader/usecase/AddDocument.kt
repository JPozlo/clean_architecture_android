package com.raywenderlich.android.majesticreader.usecase

import com.raywenderlich.android.majesticreader.data.DocumentRepository
import com.raywenderlich.android.majesticreader.domain.Document

class AddDocument(private val documentRepository: DocumentRepository) {

    //  This enables you to simplify the function call on AddBookmark instance to addBookmark() instead of addBookmark.invoke().
    suspend operator fun invoke(document: Document) = documentRepository.addDocument(document)
}