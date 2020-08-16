package com.raywenderlich.android.majesticreader.usecase

import com.raywenderlich.android.majesticreader.data.BookmarkRepository
import com.raywenderlich.android.majesticreader.domain.Bookmark
import com.raywenderlich.android.majesticreader.domain.Document

class DeleteBookmark(private val bookmarkRepository: BookmarkRepository) {

    suspend operator fun invoke(document: Document, bookmark: Bookmark) = bookmarkRepository.deleteBookmark(document, bookmark)

}