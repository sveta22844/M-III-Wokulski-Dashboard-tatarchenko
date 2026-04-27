package com.example.wokolskidashboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.wokolskidashboard.ui.components.IncomeForm
import com.example.wokolskidashboard.ui.theme.WokolskiDashBoardTheme
import com.example.wokulskidashboard.ui.MainScreen
import com.example.wokulskidashboard.ui.components.BalanceHeader
import com.example.wokulskidashboard.ui.components.ExpenseForm
import com.example.wokulskidashboard.ui.components.WokulskiButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WokolskiDashBoardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "A",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WokolskiDashBoardTheme {

//        WokulskiButton(onClick = {}, text = "Dodaj")
//        BalanceHeader(balance = 100.9)
//        MainScreen()
//        IncomeForm(onAddIncome = { _, _ -> })
//        ExpenseForm(onAddExpense = { _, _ -> })

    }
}