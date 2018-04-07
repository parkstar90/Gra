package com.parkstar;

public class ConsolePrinter extends Printer{
    public void print(String[] grades, int sum, double average) {
        String result = super.getResultString(grades, sum, average);
        System.out.println(result);
    }

}
