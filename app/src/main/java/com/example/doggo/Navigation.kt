package com.example.doggo

sealed class Navigation(val title: String) {
    object HomeScreen : Navigation("HomeScreen")
    object DetailScreen : Navigation("DetailScreen")
}