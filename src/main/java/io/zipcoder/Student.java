package io.zipcoder;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    public ArrayList<Double> examScores;
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>();
    }

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public Integer getNumberOfExamsTaken() {return examScores.size();}
}
