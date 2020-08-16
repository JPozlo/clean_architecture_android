package com.raywenderlich.android.majesticreader.usecase

import com.raywenderlich.android.majesticreader.data.DocumentRepository
import com.raywenderlich.android.majesticreader.domain.Document

class SetOpenDocument (private val documentRepository: DocumentRepository) {

    suspend operator fun invoke(document: Document) = documentRepository.setOpenDocument(document)

}