package com.singmak.attentionspanchallenge

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.singmak.attentionspanchallenge.challenge.ChallengeScreen
import com.singmak.attentionspanchallenge.records.RecordsScreen

@Composable
fun Navigation() {
    val navController = rememberNavController();
    NavHost(navController = navController, startDestination = Screen.RecordsScreen.route) {
        composable(route = Screen.RecordsScreen.route) {
            RecordsScreen(navController = navController)
        }
        composable(
            route = Screen.ChallengeScreen.route + "/{name}",
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                    defaultValue = "Focus"
                    nullable = true
                }
            )
        ) {
            entry ->
            ChallengeScreen(navController = navController, name = entry.arguments?.getString("name"))
        }
    }
}