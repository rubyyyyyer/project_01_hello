package org.example

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class HelloKotlinTest {
    @Test
    fun boyBmiTest(){
        val boy = Boy(60f,1.8f)
        Assertions.assertEquals(60f/(1.8f*1.8f),boy.bmi())
    }

    @Test
    fun girlBmiTest(){
        val girl = Girl("Ruby",60f,1.8f)
        Assertions.assertEquals(60f/(1.8f*1.8f),girl.bmi())
    }

}