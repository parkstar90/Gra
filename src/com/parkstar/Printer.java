package com.parkstar;

public class Printer {
    protected String getResultString(String[] grades, int sum, double average) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String grade : grades) {
            stringBuilder.append("학점: " + grade + "\n");
        }
        stringBuilder.append("총점 : " + sum + "\n");
        stringBuilder.append("평균 : " + average + "\n");

        return stringBuilder.toString();
    }
}
