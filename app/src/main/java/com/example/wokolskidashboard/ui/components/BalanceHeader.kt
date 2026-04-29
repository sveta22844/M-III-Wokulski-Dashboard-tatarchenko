package com.example.wokulskidashboard.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wokolskidashboard.ui.components.IncomeForm
import com.example.wokulskidashboard.ui.MainScreen

@Composable
fun BalanceHeader(balance: Double) {
    Text(
        text = "\uD83D\uDCB0 Saldo: %.2f ₽".format(balance),

        style = MaterialTheme.typography.headlineMedium,
        color = Color.Black,
        fontSize = 30.sp,
        fontWeight = FontWeight.Medium

    )
}



@Preview(showBackground = true)
@Composable
fun BalanceHeaderPreview() {
    BalanceHeader(balance = 100.9)
}