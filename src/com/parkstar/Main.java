package com.parkstar;

import java.util.Scanner;

public class Main {

    private static final int SUBJECT_COUNT = 3;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GradeCalculator gradeCalculator = new GradeCalculator();
        ConsolePrinter consolePrinter = new ConsolePrinter();
        TextPrinter textPrinter = new TextPrinter();

        int[] pointArray = new int[SUBJECT_COUNT];

        for (int i=0; i < pointArray.length; i++){
            System.out.println((i+1) + "번째"+"점수를 입력하세요 : ");
            pointArray[i] = scan.nextInt();
        }

        String[] grades = new String[SUBJECT_COUNT];
        for(int i=0; i < pointArray.length; i++){
            // 입력받은 점수를 가지고 학점을 계산한다.
            String grade = gradeCalculator.getGrade(pointArray[i]);

            // 학점 배열에 학점들 저장
            grades[i] = grade;
        }

        // 총점을 구한다
        int sum = gradeCalculator.getSum(pointArray);

        // 평균을 구한다
        double average = gradeCalculator.getAverage(sum, SUBJECT_COUNT);

        // 콘솔에 출력한다
        consolePrinter.print(grades, sum, average);

        // 파일에 출력한다
        textPrinter.printToFile(grades, sum, average);
    }

}
