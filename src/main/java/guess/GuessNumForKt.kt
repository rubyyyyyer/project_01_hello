package guess

import java.util.Random
import java.util.Scanner

fun main() {
    val secretNum = Random().nextInt(10) + 1
    val scanner = Scanner(System.`in`)
    var userInput = 0
    val counter = 5

    println("秘密數字：" + secretNum)

    for (i in 1..counter) {
        println("請輸入一個數字:${i}/$counter")
        userInput = scanner.nextInt()
        if (i != counter) {
            if (userInput > secretNum) {
                println("小一點")
            } else if (userInput < secretNum) {
                println("大一點")
            } else {
                println("恭喜你答對了!就是$secretNum")
                break
            }
        } else {
            println("哎呀!都沒有猜中。")
        }
    }
}

class GuessNumForKt {
}