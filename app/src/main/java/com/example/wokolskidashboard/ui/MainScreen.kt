package com.example.wokulskidashboard.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wokolskidashboard.model.Transaction
import com.example.wokolskidashboard.ui.components.IncomeForm
import com.example.wokulskidashboard.ui.components.BalanceHeader
import com.example.wokulskidashboard.ui.components.ExpenseForm
import com.example.wokulskidashboard.ui.components.TransactionCard

@Composable
fun MainScreen() { //buduje UI w Compose

    //główny stan/lista transakcji (przechowuje dane,odswierza IU po zmianie)
    val transactions = remember { mutableStateListOf<Transaction>() }

    //liczenie salda na podstawie transakcjii
    val balance = transactions.sumOf {  //sprawdzanie czy to wydatek
        if (it.isExpense) -it.kwota else it.kwota //if wydatek -kwota alse +kwote

    }

    //lączenie niektórych komponentów
    Column(modifier = Modifier.padding(16.dp)) {

        BalanceHeader(balance)  //баланс

        Spacer(modifier = Modifier.height(16.dp))

        //przychody
        IncomeForm { nazwa, kwota ->
            transactions.add(Transaction(nazwa, kwota, false,false)) //dodanie do listy dochod(false = nieWydatek)
        }

        Spacer(modifier = Modifier.height(16.dp))

        //wydatki
        ExpenseForm { nazwa, kwota, isExpense, isUnnecessary ->
            transactions.add(Transaction( nazwa, kwota, isExpense, isUnnecessary)) //dodanie do listy wydatek(true = wydatek)
        }

        Spacer(modifier = Modifier.height(20.dp))

        LazyColumn {
            items(transactions) {
                TransactionCard(it)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}