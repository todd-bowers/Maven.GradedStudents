package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

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
    public void addExamScoresTest() {
        //Given
        String firstName = "Todd";
        String lastName = "Bowers";
        Double[] examScores = { };
        double score1 = 100.0;
        Student student = new Student(firstName, lastName, examScores);

        //When
        student.addExamScore(score1);
        String output = student.getExamScores();
        double result = Double.parseDouble(student.getExamScores());

        //Then
        System.out.println(output);
        Assert.assertEquals(score1, result, 0);
    }
    @Test
    public void addExamScoresTest2() {
        //Given
        String firstName = "Todd";
        String lastName = "Bowers";
        Double[] examScores = { };
        double score1 = 100.0;
        Student student = new Student(firstName, lastName, examScores);

        //When
        student.addExamScore(score1);
        String output = student.getExamScores();
        double result = Double.parseDouble(student.getExamScores());

        //Then
        System.out.println(output);
        Assert.assertNotEquals(110.0, result, 0);
    }
}