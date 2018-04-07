package com.parkstar;

import java.util.Scanner;

public class Main {

    private static final int SUBJECT_COUNT = 3;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GradeCalculator gradeCalculator = new GradeCalculator();
        Printer printer = new Printer();


        int[] pointArray = new int[SUBJECT_COUNT];

        for (int i=0; i < pointArray.length; i++){
            System.out.println((i+1) + "번째"+"점수를 입력하세요 : ");
            pointArray[i] = scan.nextInt();
        }

        for(int i=0; i < pointArray.length; i++){
            // 입력받은 점수를 가지고 학점을 계산한다.
            String grade = gradeCalculator.getGrade(pointArray[i]);
            // 구한 학점을 출력한다.
            printer.printGrade(grade);
        }

        // 총점을 구한다
        int sum = gradeCalculator.getSum(pointArray);

        // 총점을 출력한다
        printer.printSum(sum);

        // 평균을 구한다
        double average = gradeCalculator.getAverage(sum, SUBJECT_COUNT);

        // 평균을 출력한다
        printer.printAverage(average);
    }

}
