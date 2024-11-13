package com.example.geeksm6_rickandmortyapi.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.foundation.lazy.items

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CharacterScreen() {
    LazyColumn {
        items(100) { index ->
            Text(
                modifier = Modifier
                    .fillMaxWidth(),
                text = "Character $index"
            )
        }
    }
}