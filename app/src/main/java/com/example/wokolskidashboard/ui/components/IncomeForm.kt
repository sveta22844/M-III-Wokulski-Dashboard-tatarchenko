package com.example.wokolskidashboard.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
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
import com.example.wokulskidashboard.ui.components.WokulskiButton
import com.example.wokulskidashboard.ui.components.WokulskiTextField

@Composable
fun IncomeForm(
    onAddIncome: (String, Double) -> Unit //funkcjia przekazania z gory/przekazuje nazwe i kwote do rodzica
){
    //stany pól
    var nazwa by remember { mutableStateOf("") }
    var kwota by remember { mutableStateOf("") }
    var error by remember { mutableStateOf(false) }


    Column {

        Text(
            text = "Przychód",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium)

        Spacer(modifier = Modifier.height(15.dp))

        //aktualizacja nazwy i kwoty
        WokulskiTextField(nazwa, { nazwa = it }, "Nazwa")
        WokulskiTextField(kwota, { kwota = it }, "Kwota")
        Text("")

        if (error) {
            Text(
                text = "Nie wpisano danych! Wpisz nazwę i kwotę.",
                color = Color.Red
            )
        }
        if (nazwa.isNotBlank() && !nazwa.any { it.isLetter() }) {
            Text(
                text = "Nazwa nie może składać się tylko z cyfr",
                color = Color.Red
            )
        }
        if (kwota.isNotBlank() && kwota.toDoubleOrNull() == null) {
            Text(
                text = "Kwota musi być liczbą",
                color = Color.Red
            )
        }


        Button(onClick = {
            val value = kwota.toDoubleOrNull()  //próba zamiany tekstu na liczbę/nie uda -> null
            // walidacja
            if (nazwa.isNotBlank() && value != null && value > 0 && nazwa.any { it.isLetter() }) {
                onAddIncome(nazwa, value) //wysyla dane do rodzica(state hoisting)
                nazwa = ""
                kwota = ""
                error = false
            } else { error = true }
        },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF12A9A5)
            )
    )
         {
        Text(
            text = "Dodaj",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium
        )
    } }

}

@Preview(showBackground = true)
@Composable
fun IncomeFormPreview() {
    IncomeForm(onAddIncome = { _, _ -> })
}


