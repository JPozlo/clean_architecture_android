package com.raywenderlich.android.majesticreader.usecase

import com.raywenderlich.android.majesticreader.data.DocumentRepository
import com.raywenderlich.android.majesticreader.domain.Document

class GetOpenDocument (private val documentRepository: DocumentRepository){

    suspend operator fun invoke() = documentRepository.getOpenDocument()

}