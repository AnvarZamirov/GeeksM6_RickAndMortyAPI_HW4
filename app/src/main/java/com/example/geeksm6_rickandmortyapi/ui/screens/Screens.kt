package com.example.geeksm6_rickandmortyapi.ui.screens

sealed class Screens(val route: String) {

    data object CharacterScreen : Screens("CharacterScreen")
    data object EpisodeScreen : Screens("SeriesScreen")
}