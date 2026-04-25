package com.example.wokulskidashboard.ui.components
import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun BalanceHeader(balance: Double) {
    //wyświetlanie tekstu z saldem
    Text(
        text = "Saldo: %.2f zł".format(balance),
        style = MaterialTheme.typography.headlineMedium
    )
}