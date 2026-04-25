package com.example.wokolskidashboard.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.wokulskidashboard.ui.components.WokulskiButton
import com.example.wokulskidashboard.ui.components.WokulskiTextField


@Composable
fun IncomeForm(
    onAddIncome: (String, Double) -> Unit //funkcjia przekazania z gory/przekazuje nazwe i kwote do rodzica
){
    //stany pól
    var nazwa by remember { mutableStateOf("") }
    var kwota by remember { mutableStateOf("") }

    Column {
        Text("Przychód")

        //aktualizacja nazwy i kwoty
        WokulskiTextField(nazwa, { nazwa = it }, "Nazwa")
        WokulskiTextField(kwota, { kwota = it }, "Kwota")

        WokulskiButton("Dodaj") { //wykonuje logikę po kliknięciu

            val value = kwota.toDoubleOrNull()  //próba zamiany tekstu na liczbę/nie uda -> null

            // walidacja
            if (nazwa.isNotBlank() && value != null && value > 0) {
                //czy nazwa nie jest pusta, czy jest poprawna,czy wartość > 0,

                onAddIncome(nazwa, value) //wysyla dane do rodzica(state hoisting)

                nazwa = ""
                kwota = ""
                //resetuje formularz po dodaniu danych
            }
        }
    }
}