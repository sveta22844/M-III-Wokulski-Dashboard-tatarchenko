package com.example.wokulskidashboard.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wokolskidashboard.ui.components.IncomeForm

@Composable //funkcja UI w Compose
fun ExpenseForm(
    onAddExpense: (String, Double) -> Unit //funkcja z rodzica
) {
    //stany pol
    var nazwa by remember { mutableStateOf("") }
    var kwota by remember { mutableStateOf("") }
    var isExpense by remember { mutableStateOf(false) }

    Column {

        Text(
            text = "Wydatek",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium
        )

        Spacer(modifier = Modifier.height(15.dp))

        WokulskiTextField(nazwa, { nazwa = it }, "Nazwa")
        WokulskiTextField(kwota, { kwota = it }, "Kwota")

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Zbyteczny",
                fontSize = 17.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 9.dp)
            )

            Switch(
                checked = isExpense,
                onCheckedChange = { isExpense = it },

                colors = SwitchDefaults.colors(
                    checkedThumbColor = Color.White, // kółko gdy ON
                    checkedTrackColor = Color(0xFFD9534F), // tło gdy ON (czerwony)
                    uncheckedThumbColor = Color.White, // kółko gdy OFF
                    uncheckedTrackColor = Color.LightGray // tło gdy OFF
                )
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                val value = kwota.toDoubleOrNull()
                if (nazwa.isNotBlank() && value != null && value > 0) {
                    onAddExpense(nazwa, value)
                    nazwa = ""
                    kwota = ""
                }
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFBE413D) // czerwony dla wydatków
            )
        ) {
            Text(
                text = "Dodaj",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium
            )
        } }
}


@Preview(showBackground = true)
@Composable
fun ExpenseFormPreview() {
    ExpenseForm(onAddExpense = { _, _ -> })
}
