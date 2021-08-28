package com.mycompany.part10_1_cluster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> positives = new ArrayList<>();
        positives.add(1);
        positives.add(-9);
        positives.add(40);
        positives.add(10);
        positives.add(-3);
        System.out.println();

    }

    public static List<Integer> positive(List<Integer> numbers) {
        ArrayList<Integer> positiveNumbers = numbers.stream()
                .filter(number -> number > 0)
                .collect(Collectors.toCollection(ArrayList::new));

        return positiveNumbers;

    }

}
