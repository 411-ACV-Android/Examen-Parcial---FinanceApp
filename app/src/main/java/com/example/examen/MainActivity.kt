package com.example.examen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.examen.ui.theme.ExamenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

data class User(
    val name: String,
    val balance: Double
)

data class SummaryCard(
    val title: String,
    val amount: String,
    val backgroundColor: Color
)

data class Transaction(
    val establishment: String,
    val category: String,
    val amount: Double,
    val time: String,
    val iconUrl: String
)

val mockUser = User("Juan", 25450.0)

val summaryCards = listOf(
    SummaryCard("Actividad", "$1,200", Color(0xFFE3F2FD)),
    SummaryCard("Ventas", "$8,500", Color(0xFFE8F5E9)),
    SummaryCard("Ganancias", "$3,200", Color(0xFFFFF3E0))
)

val transactionList = listOf(
    Transaction("Walmart", "Groceries", -850.0, "10:30 AM", "https://picsum.photos/id/1/100/100"),
    Transaction("Shell", "Fuel", -1200.0, "11:15 AM", "https://picsum.photos/id/2/100/100"),
    Transaction("Apple Store", "Electronics", -25000.0, "12:00 PM", "https://picsum.photos/id/3/100/100"),
    Transaction("Amazon", "Books", -450.0, "02:30 PM", "https://picsum.photos/id/4/100/100"),
    Transaction("Starbucks", "Dining", -120.0, "04:45 PM", "https://picsum.photos/id/5/100/100"),
    Transaction("Refund Inc", "Food & Drinks", 500.0, "06:00 PM", "https://picsum.photos/id/6/100/100")
)