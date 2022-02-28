package com.singmak.attentionspanchallenge.challenge

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun ChallengeScreen(navController: NavController, name: String?) {
    Column {
        Text("$name Challenge!")
    }
}