package com.ugcc.calendar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                var text by remember { mutableStateOf("UGCC Calendar\n\n(тут буде календар і цитати)") }

                Surface {
                    Column {
                        Text(text, modifier = androidx.compose.ui.Modifier.padding(16.dp))

                        Button(
                            onClick = { text = "📖 Духовне слово\n\n«Піст є ліками для душі…»" },
                            modifier = androidx.compose.ui.Modifier.padding(16.dp)
                        ) {
                            Text("Духовне слово")
                        }
                    }
                }
            }
        }
    }
}
