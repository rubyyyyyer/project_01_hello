package org.example

class HelloKotlin {
}

fun main() {
//    println("Hello Kotlin!")
//    Boy().hello()
    val b=Boy()
    b.hello()
    val age = 19
    var age2 : Int = 19
    age2 =20

    var weight = 66.5f
    var weight2 : Float = 66.5f

    var name2 : String
    name2 = "Ruby"

}

class Boy{
    fun hello(){
        println("Boy say hi kotlin!")
    }
}