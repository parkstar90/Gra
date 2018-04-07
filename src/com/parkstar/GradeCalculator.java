package com.parkstar;

public class GradeCalculator {
    public String getGrade(int point) {
        if (point >= 90) {
            return "A";
        } else if (point >= 70) {
            return "B";
        } else if (point >= 50) {
            return "C";
        } else if (point >= 30) {
            return "D";
        } else if (point <= 20) {
            return "F";
        }
        return null;
    }

    public int getSum(int[] points) {
        int sum = 0;

        for(int i=0; i < points.length; i++){
            sum += points[i];
        }
        return sum;
    }

    public double getAverage(int sum, int subjectCount){
        double average = sum / subjectCount;
        return  average;
    }
}
