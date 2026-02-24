package com.example.listednotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.listednotes.ui.JournalScreen
import androidx.compose.material3.Surface
import com.example.listednotes.ui.theme.ListedNotesTheme
import com.example.listednotes.viewmodel.JournalViewModel

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<JournalViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListedNotesTheme {
                Surface(color = MaterialTheme.colorScheme.background) {
                    JournalScreen(viewModel)
                }
            }
        }
    }
}