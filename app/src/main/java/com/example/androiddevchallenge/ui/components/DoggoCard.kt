/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.height
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.layout.width
import com.example.androiddevchallenge.data.Doggo
import com.example.androiddevchallenge.ui.theme.purpleAlpha20

@Composable
fun DoggoCard(doggo: Doggo, navigateToDetailsScreen: (Doggo) -> Unit) {
    val isSelected = remember { mutableStateOf(false) }
    val backgroundColor by animateColorAsState(if (isSelected.value) Color.Red else Color.Transparent)

    Card(
        modifier =
        Modifier
            .padding(top = 16.dp, bottom = 8.dp, start = 16.dp, end = 16.dp)
            .fillMaxWidth()
            .clickable {
                navigateToDetailsScreen.invoke(doggo)
            },
        shape = MaterialTheme.shapes.small,
        border = BorderStroke(1.dp, color = purpleAlpha20)
    ) {
        Row {
            Image(
                painter = painterResource(doggo.image),
                contentDescription = null,
                modifier = Modifier
                    .height(120.dp)
                    .width(140.dp)
                    .clip(shape = RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )
            Column {
                Text(
                    text = doggo.name,
                    style = MaterialTheme.typography.h5,
                    modifier = Modifier
                        .padding(start = 24.dp, end = 24.dp, top = 16.dp)
                        .background(color = backgroundColor)
                )

                Text(
                    text = doggo.description,
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier
                        .padding(start = 24.dp, end = 24.dp)
                        .background(color = backgroundColor)
                )
            }
        }
    }
}

