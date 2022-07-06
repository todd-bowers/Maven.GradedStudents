package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class StudentTest {

    @Test
    public void constructorTest() {
        //Given
        String firstName = "Todd";
        String lastName = "Bowers";
        Double[] examScores = { };

        //When
        Student student = new Student(firstName, lastName, examScores);
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
        Double[] examScores = { };

        //When
        Student student = new Student(firstName, lastName, examScores);
        String retrievedFirstName = student.getFirstName();
        String retrievedLastName = student.getLastName();

        //Then
        Assert.assertNotEquals(null, retrievedFirstName);
        Assert.assertNotEquals(null, retrievedLastName);
    }

    @Test
    public void getExamScoresTest() {
        //Given
        String firstName = "Todd";
        String lastName = "Bowers";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, examScores);

        //When
        String output = student.getExamScores();

        //Then
        System.out.println(output);
        Assert.assertEquals(Arrays.toString(examScores), output);
    }
    @Test
    public void addExamScoresTest() {
        //Given
        String firstName = "Todd";
        String lastName = "Bowers";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);

        //When
        student.addExamScore(100.0);
        String output = student.getExamScores();

        //Then
        System.out.println(output);
        Assert.assertEquals("[100.0]", output);
    }
    @Test
    public void addExamScoresTest2() {
        //Given
        String firstName = "Todd";
        String lastName = "Bowers";
        Double[] examScores = { };
        Student student = new Student(firstName, lastName, examScores);

        //When
        student.addExamScore(100.0);
        String output = student.getExamScores();

        //Then
        System.out.println(output);
        Assert.assertNotEquals("[110.0]", output);
    }

    @Test
    public void setExamScoreTest() {
        //Given
        String firstName = "Todd";
        String lastName = "Bowers";
        Double[] examScores = { 100.0 };
        Student student = new Student(firstName, lastName, examScores);

        //When
        student.setExamScore(1, 150.0);
        String output = student.getExamScores();

        //Then
        System.out.println(output);
        Assert.assertEquals("[150.0]", output);
    }
}