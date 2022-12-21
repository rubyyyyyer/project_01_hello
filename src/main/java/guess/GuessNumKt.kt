package guess

import java.util.Random
import java.util.Scanner

fun main() {
//    val scanner = Scanner(System.`in`)
    val secretNum = Random().nextInt(10)+1

    println("我的秘密數字" + secretNum)
    var userInput = 0

    while (userInput != secretNum){
    print("請輸入一個數字:")
    userInput = readLine()!!.toInt()

        if (userInput > secretNum){
            println("小一點")
        }else if(userInput < secretNum){
            println("大一點")
        }else{
            println("答對了!就是" + secretNum)
        }
    }
}

class GuessNumKt {
}