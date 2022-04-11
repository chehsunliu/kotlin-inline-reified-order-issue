package com.example

import org.junit.jupiter.api.Test

internal class AppTest {
    @Test
    fun demo0() {
        println("demo0 started")
        val v = App().execute(3)
        println("> $v")
    }
}