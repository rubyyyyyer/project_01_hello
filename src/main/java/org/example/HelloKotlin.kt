package org.example

class HelloKotlin {
}

fun main() {
//    println("Hello Kotlin!")
//    Boy().hello()
    val b=Boy()
    b.hello()
}

class Boy{
    fun hello(){
        println("Boy say hi kotlin!")
    }
}