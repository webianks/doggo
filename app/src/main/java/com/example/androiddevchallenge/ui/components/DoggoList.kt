package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.example.androiddevchallenge.data.Doggo

@Composable
fun DoggoList(doggos: List<Doggo>, navigateToDetailsScreen: (Doggo) -> Unit) {
    LazyColumn {
        items(count = doggos.size) { pos ->
            DoggoCard(doggo = doggos[pos], navigateToDetailsScreen)
        }
    }
}
