package io.zipcoder;

import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    public Double[] examScores;
    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public Integer getNumberOfExamsTaken() {return examScores.length;}

    public String getExamScores() {
        return Arrays.toString(examScores);
//        List string = Arrays.asList(examScores);
//        return String.valueOf(string);
//        return examScores.stream().map(Object::toString).collect(Collectors.joining(", "));
    }
    public void addExamScore(double score) {
        Double[] updated = new Double[examScores.length + 1];
        System.arraycopy(examScores, 0, updated, 0, examScores.length);
        updated[updated.length-1] = score;
        examScores = updated;
    }

    public void setExamScore(int examNumber, double newScore) {
        examScores[examNumber-1] = newScore;
    }

    public double getAverageExamScore() {
        double sum = 0;
        for (double i : examScores)
            sum += i;
        return (sum/examScores.length);
    }
}
