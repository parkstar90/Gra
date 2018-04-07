package com.parkstar;

import java.io.FileWriter;
import java.io.IOException;

public class TextPrinter extends Printer {
    public void printToFile(String[] grades, int sum, double average) {
        String result = super.getResultString(grades, sum, average);

        try (FileWriter fw = new FileWriter("C:\\study\\Grade\\out\\out.txt")) {
            fw.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            FileWriter fw = new FileWriter("C:\\study\\Grade\\out\\out.txt");
//            fw.write(result);
//            fw.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
