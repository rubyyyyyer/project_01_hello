package org.example;

import org.example.Girl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GirlTest {
    @Test
    public void bmiTest(){
        Girl girl = new Girl("rubyyyyyer",60,1.8f);
        Assertions.assertEquals(60/(1.8f*1.8f),girl.bmi());
    }
}
