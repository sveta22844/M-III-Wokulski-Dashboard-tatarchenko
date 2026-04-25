package com.example.wokulskidashboard.ui

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.wokolskidashboard.model.Transaction
import com.example.wokulskidashboard.ui.components.BalanceHeader

@Composable
fun MainScreen() { //buduje UI w Compose

    //główny stan/lista transakcji
    val transactions = remember { mutableStateListOf<Transaction>() }

    //liczenie salda na podstawie transakcjii
    val balance = transactions.sumOf {  //sprawdzanie czy to wydatek
        if (it.isExpense) -it.kwota else it.kwota //if wydatek -kwota alse +kwote
    }

    Column(modifier = Modifier.padding(16.dp)) {
        BalanceHeader(balance) //wyświetlenie przez komponent dla nagłowka
    }
}