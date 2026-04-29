package com.example.wokolskidashboard
import com.example.wokolskidashboard.model.Transaction
import org.junit.Assert.assertEquals
import org.junit.Test

class BalanceTest {


    @Test
    fun saldoPowinnoBycLiczonePoprawnie() {
        val transactions = listOf(
            Transaction("Sprzedaz", 100.0, false, false), //    przychod +100
            Transaction("Zakup", 40.0, true, false)       //    wydatek  -40
        )

        val balance = transactions.sumOf {
            if (it.isExpense) -it.kwota else it.kwota
        }
        assertEquals(60.0, balance, 0.01) //oczekiwany wynik salda 60  bo  100-40=60!
    }
}