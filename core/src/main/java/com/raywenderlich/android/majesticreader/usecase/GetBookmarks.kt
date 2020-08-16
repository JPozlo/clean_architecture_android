package com.raywenderlich.android.majesticreader.usecase

import com.raywenderlich.android.majesticreader.data.BookmarkRepository
import com.raywenderlich.android.majesticreader.domain.Bookmark
import com.raywenderlich.android.majesticreader.domain.Document

class GetBookmarks (private val bookmarkRepository: BookmarkRepository) {

    suspend operator fun invoke(document: Document) = bookmarkRepository.getBookmarks(document)

}