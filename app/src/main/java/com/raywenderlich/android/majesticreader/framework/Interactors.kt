package com.raywenderlich.android.majesticreader.framework

import com.raywenderlich.android.majesticreader.usecase.*

data class Interactors(val addBookmark: AddBookmark,
                       val getBookmarks: GetBookmarks,
                       val deleteBookmark: DeleteBookmark,
                       val addDocument: AddDocument,
                       val getDocuments: GetDocuments,
                       val deleteDocument: DeleteDocument,
                       val getOpenDocument: GetOpenDocument,
                       val setOpenDocument: SetOpenDocument)