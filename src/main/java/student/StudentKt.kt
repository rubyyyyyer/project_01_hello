package student

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("輸入姓名:")
//    val name = scanner.next()
    val name = null
    print("輸入英文成績:")
    val english = scanner.nextInt()
    print("輸入數學成績:")
    val math = scanner.nextInt()

    val stu = StudentKt(name, math, english)
    stu.print()
    stu.nameCheck()
    println(stu.getAverage())
    println(stu.highest())
    println(stu.grading())
}

class StudentKt(var name: String?, var english: Int, var math: Int, var getAverage: Int = 0, var highest: Int = 0) {
    fun print() {
        println(name + "\t" + math + "\t" + english + "\t" + (math + english) / 2)
    }

    fun nameCheck() {
        println(name?.length)
    }

    fun getAverage(): Int {
        getAverage = (english + math) / 2
        return getAverage
    }

    fun highest(): Int {
        highest = if (math > english) math else english
        return highest
    }
    fun grading():Char{
        var grading = when (getAverage()){
            in 90..100 ->'A'
            in 80..89 ->'B'
            in 70..79 ->'C'
            in 60..69 ->'D'
            else -> 'F'
        }
        return grading
    }
}