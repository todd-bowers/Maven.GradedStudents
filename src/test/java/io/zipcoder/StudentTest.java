package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void constructorTest() {
        //Given
        String firstName = "Todd";
        String lastName = "Bowers";

        //When
        Student student = new Student(firstName, lastName);
        String retrievedFirstName = student.getFirstName();
        String retrievedLastName = student.getLastName();

        //Then
        Assert.assertEquals(firstName, retrievedFirstName);
        Assert.assertEquals(lastName, retrievedLastName);
    }
    @Test
    public void constructorTest2() {
        //Given
        String firstName = "Todd";
        String lastName = "Bowers";

        //When
        Student student = new Student(firstName, lastName);
        String retrievedFirstName = student.getFirstName();
        String retrievedLastName = student.getLastName();

        //Then
        Assert.assertNotEquals(null, retrievedFirstName);
        Assert.assertNotEquals(null, retrievedLastName);
    }
}