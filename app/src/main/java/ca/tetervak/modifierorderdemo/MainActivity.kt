package ca.tetervak.modifierorderdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ca.tetervak.modifierorderdemo.ui.theme.ModifierOrderDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ModifierOrderDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Modifier",
                        modifier = Modifier
                            .padding(innerPadding)
                            .padding(10.dp)
                            .border(width = 2.dp, color = Color.Red)
                            .padding(30.dp)
                            .border(width = 4.dp, color = Color.DarkGray)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .fillMaxSize()
            .padding(20.dp)
            .border(width = 2.dp, color = Color.Blue)
            .background(color = Color.Cyan)
            .padding(40.dp)
            .border(width = 2.dp, color = Color.Magenta)
    ){
        Text(
            text = "Hello $name!",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 2.dp, color = Color.White)
                .padding(10.dp)
                .background(color = Color.LightGray)

        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ModifierOrderDemoTheme {
        Greeting("Android")
    }
}