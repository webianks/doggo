package com.example.doggo

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.doggo.data.DogProvider
import com.example.doggo.ui.pages.DetailsScreen
import com.example.doggo.ui.pages.HomeScreen
import com.example.doggo.ui.theme.DoggoAppTheme

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
fun DoggoApp(){
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

