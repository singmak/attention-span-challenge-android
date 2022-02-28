package com.singmak.attentionspanchallenge.records

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.singmak.attentionspanchallenge.Screen

@Composable
fun RecordsScreen(navController: NavController) {
    Column {
        Button(onClick = {
            navController.navigate("${Screen.ChallengeScreen.route}/test")
        }) {
            Text(text = "Challenge")
        }
    }
}