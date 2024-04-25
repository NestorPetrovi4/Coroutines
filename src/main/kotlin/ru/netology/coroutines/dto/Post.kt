package ru.netology.coroutines.dto

data class Post(
    val id: Long,
    val authorId: Long,
    val authorAvatar: String,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
)

object PostService {
    private val authors = mutableListOf<Author>()

    fun getAuthors() = authors
    fun addAuthors(author: Author){
        authors += author
    }
}