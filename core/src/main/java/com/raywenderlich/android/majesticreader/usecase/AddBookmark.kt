package com.raywenderlich.android.majesticreader.usecase

import com.raywenderlich.android.majesticreader.data.BookmarkRepository
import com.raywenderlich.android.majesticreader.domain.Bookmark
import com.raywenderlich.android.majesticreader.domain.Document

class AddBookmark(private val bookmarkRepository: BookmarkRepository) {

    //  This enables you to simplify the function call on AddBookmark instance to addBookmark() instead of addBookmark.invoke().
    suspend operator fun invoke(document: Document, bookmark: Bookmark) = bookmarkRepository.addBookmark(document, bookmark)
}