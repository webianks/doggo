package com.example.doggo.ui.pages

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import com.example.doggo.data.DogProvider
import com.example.doggo.data.Doggo
import com.example.doggo.ui.components.DoggoList

@Composable
fun HomeScreen(title: String,navigateToDetailsScreen: (Doggo) -> Unit) {
    Scaffold(
        backgroundColor = MaterialTheme.colors.background,
        topBar = {
            TopAppBar(
                title = {
                    Text(title)
                },
            )
        },
        content = {
            DoggoList(doggos = DogProvider.doggos,navigateToDetailsScreen)
        })

}