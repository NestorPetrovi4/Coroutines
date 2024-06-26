package ru.netology.coroutines.dto

data class Comment(
    val id: Long,
    val authorId: Long,
    val authorAvatar: String,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
)