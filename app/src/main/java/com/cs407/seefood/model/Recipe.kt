package com.cs407.seefood.model

import kotlinx.serialization.Serializable

@Serializable
data class Recipe(
    val id: String,
    val title: String,
    val imageUrl: String? = null,
    val ingredients: List<String> = emptyList(),
    val steps: List<String> = emptyList()
)
