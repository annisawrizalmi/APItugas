package com.example.classproject


data class MainModel (
    val count: Int,
    val lastItemIndex: Int,
    val page: Int,
    val result: List<Result>,
    val totalCount: Int,
    val totalPages: Int
)
data class Result (
    val _id: String,
    val author: String,
    val authorSlug: String,
    val content: String,
    val dateAdded : String,
    val dateModified: String,
    val length: String,
    val tags: List<String>
        )