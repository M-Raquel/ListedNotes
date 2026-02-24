package com.example.listednotes.model

data class JournalEntry(
    val id: Long = System.currentTimeMillis(),
    val title: String,
    val content: String, // "happy, anxious, neutral
    val mood: String,
    val category: String, //Work, Personal, School, Nature
    val date: String,
    // val imageUri: String? = null // Commented out for future goal of Photo Integration
)