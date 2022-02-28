package com.singmak.attentionspanchallenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.singmak.attentionspanchallenge.ui.theme.AttentionSpanChallengeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    var testCount by remember { mutableStateOf(0) }
    AttentionSpanChallengeTheme {
        // A surface container using the 'background' color from the theme
//        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
//            Greeting("Android")
//            Counter(testCount, onClick = { testCount++ })
//        }
        Navigation()
    }

}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun Counter(count: Int, onClick: () -> Unit) {
    Button( onClick = onClick) {
        Text("clicks counted: $count")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AttentionSpanChallengeTheme {
        Greeting("Android")
    }
}