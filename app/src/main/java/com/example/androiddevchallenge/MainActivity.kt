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
package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.data.DogProvider
import com.example.androiddevchallenge.ui.pages.DetailsScreen
import com.example.androiddevchallenge.ui.pages.HomeScreen
import com.example.androiddevchallenge.ui.theme.DoggoAppTheme

const val TITLE: String = "Pet a doggo"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DoggoAppTheme {
                DoggoApp()
            }
        }
    }
}

@Composable
fun DoggoApp() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = Navigation.HomeScreen.title) {
        composable(Navigation.HomeScreen.title) {
            HomeScreen(
                title = TITLE,
                navigateToDetailsScreen = { dog ->
                    navController.navigate(Navigation.DetailScreen.title + "/${dog.id}")
                }
            )
        }
        composable(Navigation.DetailScreen.title + "/{id}") { backStackEntry ->
            val dogId = backStackEntry.arguments?.getString("id")
            val doggo = DogProvider.doggos.find { it.id == dogId }
                ?: throw IllegalStateException("Doggo not found")
            DetailsScreen(
                doggo = doggo,
                navigateBack = { navController.popBackStack() }
            )
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    DoggoAppTheme {
        DoggoApp()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    DoggoAppTheme(darkTheme = true) {
        DoggoApp()
    }
}
