/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.example

class App {
    inline fun <reified T> execute(value: T): T {
        return createCustomAnimal<T>().foo(value)
    }
}