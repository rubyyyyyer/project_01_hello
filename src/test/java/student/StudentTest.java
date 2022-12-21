package student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void highestTest(){
        Student student = new Student("Rubyyyyyer",100,80);
        Assertions.assertEquals(100,student.highest());
    }

    @Test
    public void getAverageTest(){
        Student student = new Student("Rubyyyyyer",100,80);
        Assertions.assertEquals((100+80)/2,student.getAverage());
    }

}
