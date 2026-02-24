package com.example.listednotes.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.listednotes.model.JournalEntry
import java.text.SimpleDateFormat
import java.util.*

class JournalViewModel : ViewModel() {
    private val _entries = mutableStateListOf<JournalEntry>()
    val entries: List<JournalEntry> get() = _entries

    fun addEntry(title: String, content: String, mood: String, category: String) {
        val currentDate = SimpleDateFormat("MMM dd, yyyy", Locale.getDefault()).format(Date())

        val newEntry = JournalEntry(
            title = title,
            content = content,
            mood = mood,
            category = category,
            date = currentDate
        )
        _entries.add(newEntry)
    }

    fun deleteEntry(entry: JournalEntry) {
        _entries.remove(entry)
    }
}