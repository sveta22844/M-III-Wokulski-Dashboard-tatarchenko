package com.example.wokolskidashboard.model

//klasa danych
data class Transaction(
    val nazwa: String,
    val kwota: Double,
    val isExpense: Boolean,  //czy wydatek
    val isUnnecessary: Boolean //czy zbyteczny
)