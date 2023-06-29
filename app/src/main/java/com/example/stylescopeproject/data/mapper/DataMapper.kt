package com.example.stylescopeproject.data.mapper

interface DataMapper<T> {
    fun toDomain(): T
}