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
import com.example.wokulskidashboard.ui.MainScreen
import com.example.wokulskidashboard.ui.components.BalanceHeader
import com.example.wokulskidashboard.ui.components.ExpenseForm
import com.example.wokulskidashboard.ui.components.WokulskiButton
import com.example.wokulskidashboard.ui.theme.WokolskiDashBoardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WokolskiDashBoardTheme {
                MainScreen()
            }
        }
    }
}



