package org.example

class HelloKotlin {
}

fun main() {
//    println("Hello Kotlin!")
//    Boy().hello()
    val b=Boy(65.5f,1.8f)
    println( b.bmi())
}

class Boy(var weight:Float,var height:Float){
    fun bmi():Float{
        val bmi = weight/(height*height)
        return bmi
    }
    fun hello(){
        println("Boy say hi kotlin!")
    }
}

