package com.example

inline fun <reified T> createCustomAnimal(): AbstractAnimal<T> {
    println("calling createCustomAnimal")

    return object : AbstractAnimal<T>() {
        override fun foo(value: T): T {
            println("calling foo")
            return value
        }
    }
}