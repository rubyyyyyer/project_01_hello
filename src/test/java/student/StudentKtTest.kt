package student

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assumptions
import org.junit.jupiter.api.Test

class StudentKtTest {
    val english = 100
    val math = 60

    @Test
    fun getAverageTest(){
        val studentKt = StudentKt("Ruby",english,math)
        Assertions.assertEquals((100+60)/2,studentKt.getAverage())
    }

    @Test
    fun highestTest(){
        val studentKt = StudentKt("Ruby",english,math)
        Assertions.assertEquals(100,studentKt.highest())
    }

    @Test
    fun gradingTest(){
        val studentKt = StudentKt("Ruby",english,math)
        Assertions.assertEquals('B',studentKt.grading())
    }
}