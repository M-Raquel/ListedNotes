package com.example.listednotes.ui

import android.R
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.listednotes.viewmodel.JournalViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JournalScreen(viewModel: JournalViewModel) {
    var showDialog by remember { mutableStateOf(false)}

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("SnapShot Entries", style =
                    MaterialTheme.typography.headlineMedium) }
            ) },
        floatingActionButton = {
            FloatingActionButton(onClick = { showDialog = true }) {
                Icon(Icons.Default.Add, contentDescription = "Add Entry")
            }
        }
    ) { padding ->
        Column(modifier = Modifier.padding(padding)) {
            LazyColumn {
                items(viewModel.entries) { entry ->
                    Card(modifier = Modifier.fillMaxWidth().padding(8.dp)) {
                        Row(modifier = Modifier.padding(16.dp),
                            horizontalArrangement = Arrangement.SpaceBetween) {
                            Column(modifier = Modifier.weight(1f)) {
                                Text(text = entry.title, style = MaterialTheme.typography.headlineSmall)

                                Text(text = "${entry.category} | ${entry.mood}",
                                    style = MaterialTheme.typography.headlineSmall,
                                    color = MaterialTheme.colorScheme.primary)

                                Spacer(modifier = Modifier.height(4.dp))

                                Text(text = entry.content)
                                Text(
                                    text = entry.date,
                                    style = MaterialTheme.typography.labelSmall,
                                    color = MaterialTheme.colorScheme.secondary)
                            }
                            IconButton(onClick = { viewModel.deleteEntry(entry) }) {
                                Icon(Icons.Default.Delete, contentDescription = "Delete")
                            }
                        }
                    }
                }
            }
            if (showDialog) {
                AddEntryDialog(
                    onDismiss = { showDialog = false},
                    onSave = { t, c, m, cat ->
                        viewModel.addEntry(t, c, m, cat)
                        showDialog = false
                    }
                )
            }
        }
    }
}
