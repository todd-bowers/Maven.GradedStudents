package io.zipcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private String firstName;
    private String lastName;
    public ArrayList<Double> examScores;
    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>();
    }

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public Integer getNumberOfExamsTaken() {return examScores.size();}

    public String getExamScores() {
//        List<String> string = new ArrayList<String>();
//        for (Double d : examScores)
//            string.add(d.toString());
        return examScores.stream().map(Object::toString).collect(Collectors.joining(", "));
    }
    public void addExamScore(double examScore) {
        examScores.add(examScore);
    }

    public void setExamScores(int examNumber, double newScore) {
        examNumber -= 1;
        examScores.set(examNumber, newScore);
    }
}
