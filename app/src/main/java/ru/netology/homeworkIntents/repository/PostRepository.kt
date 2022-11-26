package ru.netology.homeworkIntents.repository;

import androidx.lifecycle.LiveData

import ru.netology.homeworkIntents.dto.Post


interface PostRepository {
    fun get(): LiveData<List<Post>>
    fun save(post: Post)
    fun likeById(id: Long)
    fun shareById(id: Long)
    fun viewById(id: Long)
    fun removeById(id: Long)
}