package com.example.wokulskidashboard.ui.components


import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.wokolskidashboard.ui.components.IncomeForm
import com.example.wokulskidashboard.ui.MainScreen

@Composable
fun BalanceHeader(balance: Double) {
    //wyświetlanie tekstu z saldem
    Text(
        text = "Saldo: %.2f zł".format(balance), //%.2f liczba z 2 miejsca po przecinku
        style = MaterialTheme.typography.headlineMedium //styl tekstu
    )
}



@Preview(showBackground = true)
@Composable
fun BalanceHeaderPreview() {
    BalanceHeader(balance = 100.9)
}