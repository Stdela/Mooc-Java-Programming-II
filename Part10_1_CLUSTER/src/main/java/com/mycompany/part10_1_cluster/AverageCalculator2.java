package com.mycompany.part10_1_cluster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageCalculator2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> positives = new ArrayList<>();
        while (true) {
            System.out.println("Insert numbers, end to end lmao");
            String number = scanner.nextLine();
            if (number.equals("end")) {
                break;
            }
            positives.add(number);
        }
        System.out.println("Insert command. P to show positives averages, else to show negatives average");
        String option = scanner.nextLine();
        if (option.equals("p")) {
            double average = positives.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            System.out.println(average);
        } else {
            double average = positives.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            System.out.println(average);
        }

    }

}
