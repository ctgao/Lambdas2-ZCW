import org.junit.Assert;
import org.junit.Test;

import java.time.Month;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void getAgeTest() {
        //Given
        // born in 2010 means you are 13
        int expected = 13;
        Person p = new Person();
        p.setBirthday(2010, Month.APRIL, 24);
        //When
        int actual = p.getAge();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getGenderTest(){
        //Given
        Person.Sex expected = Person.Sex.FEMALE;
        Person p = new Person();
        p.setGender(expected);
        //When
        Person.Sex actual = p.getGender();
        //Then
        Assert.assertEquals(expected, actual);
    }
}