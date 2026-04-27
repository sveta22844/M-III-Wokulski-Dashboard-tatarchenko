package com.example.wokolskidashboard

import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class ValidationTest {
    private fun validate(name: String, value: Double?): Boolean {
        return name.isNotBlank() && value != null && value > 0
    }


    @Test
    fun odrzucaPustaNazwe() {
        assertFalse(validate("", 10.0))
    }
    @Test
    fun odrzucaZero() {
        assertFalse(validate("Test", 0.0))
    }
    @Test
    fun odrzucaNullKwote() {
        assertFalse(validate("Test", null))
    }
    @Test
    fun akceptujePoprawneDane() {
        assertTrue(validate("Test", 20.0))
    }





}