package com.example.wokolskidashboard

import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class ValidationTest {
    private fun validate(name: String, value: Double?): Boolean { //walidacja/sprawdzanie
        return name.isNotBlank() && value != null && value > 0
    }


    @Test
    fun odrzucaPustaNazwe() {
        assertFalse(validate("", 10.0))  //czy przyjmie pusty string
    }
    @Test
    fun odrzucaZero() {
        assertFalse(validate("Test", 0.0))  //tak odrzuca
    }
    @Test
    fun odrzucaNullKwote() {
        assertFalse(validate("Test", null))  //tak odrzyca
    }
    @Test
    fun akceptujePoprawneDane() {
        assertTrue(validate("Test", 20.0))   //tak akceptuje
    }





}