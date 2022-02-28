package com.singmak.attentionspanchallenge

sealed class Screen(val route: String) {
    object RecordsScreen : Screen("records_screen")
    object ChallengeScreen : Screen("challenge_screen")
}