package com.example.listednotes.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.*
import androidx.compose.runtime.*

@Composable
fun AddEntryDialog(
    onDismiss: () -> Unit,
    onSave: (String, String, String, String) -> Unit
) {
    var title by remember { mutableStateOf("") }
    var content by remember { mutableStateOf("") }
    var mood by remember { mutableStateOf("") }
    var category by remember { mutableStateOf("") }
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("New Journal Entry") },
        text = {
            Column {
                TextField(value = title, onValueChange = { title = it }, label = { Text("Title") })
                TextField(
                    value = content,
                    onValueChange = { content = it },
                    label = { Text("Content") })
                TextField(value = mood, onValueChange = { mood = it }, label = { Text("Mood") })
                TextField(
                    value = category,
                    onValueChange = { category = it },
                    label = { Text("Category") })
            }
        },
        confirmButton = {
            TextButton(onClick = {
                if (title.isNotBlank()) {
                    onSave(title, content, mood, category)
                }
            }) {Text("Save")}
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {Text("Cancel")}
        }
    )
}
