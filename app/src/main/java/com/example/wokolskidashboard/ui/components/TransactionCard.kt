package com.example.wokulskidashboard.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wokolskidashboard.model.Transaction
import com.example.wokulskidashboard.ui.MainScreen

@Composable
fun TransactionCard(transaction: Transaction) {

    //видатек червоний колір  przychód синій колір
    val color = if (transaction.isExpense) Color.Red else Color(0xFF0C9396)

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp)
    ) {
        Row(
            modifier = Modifier.padding(15.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text(
                text = transaction.nazwa,  //wyświetla
                fontWeight = FontWeight.Medium
            )

            Text(
                text = " ${transaction.kwota} zł", //wyświetla
                color = color,
                fontWeight = FontWeight.Bold
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun TransactionCardPreview() {
    TransactionCard(transaction = Transaction("Przychód", 100.0, false))
}