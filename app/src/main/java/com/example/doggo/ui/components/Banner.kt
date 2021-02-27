package com.example.doggo.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.doggo.data.Doggo

@Composable
fun Banner(doggo: Doggo) {
    Image(
        painter = painterResource(doggo.image),
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1f)
            .background(
                Color.LightGray
            ),
        contentScale = ContentScale.Crop
    )
}