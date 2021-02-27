package com.example.androiddevchallenge.ui.pages

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import com.example.androiddevchallenge.data.DogProvider
import com.example.androiddevchallenge.data.Doggo
import com.example.androiddevchallenge.ui.components.DoggoList

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