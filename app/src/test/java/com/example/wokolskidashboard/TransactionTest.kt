package com.example.wokolskidashboard
import com.example.wokolskidashboard.model.Transaction
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class TransactionTest {

    @Test
    fun przychodJestPoprawny() {
        val tx = Transaction("Sprzedaz", 50.0, false, false)
        assertFalse(tx.isExpense) //czy nie jest wydatkiem
        assertEquals(50.0, tx.kwota, 0.01) //czy poprawna kwota
    }
    @Test
    fun wydatekJestOznaczony() {
        val tx = Transaction("Kwiaty", 20.0, true, false)
        assertTrue(tx.isExpense) //czy rozpoznaje wydatek
    }

    @Test
    fun zbytecznyWydatekDziala() {
        val tx = Transaction("Kareta", 100.0, true, true)
        assertTrue(tx.isExpense)
        assertTrue(tx.isUnnecessary) //czy oznaczony jako zbyteczny
    }
}