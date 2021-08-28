package com.mycompany.part10_1_cluster;

import java.util.ArrayList;
import java.util.Scanner;

public class UniqueLastNames {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        while (true) {
            System.out.println("Continue personal information input? \"quit\" ends:");
            String continueQ = "quit";
            if (scanner.hasNextLine()) {
                continueQ = scanner.next();
            }

            if (continueQ.equals("quit")) {
                break;
            }

            System.out.print("Input first name: ");
            String firstName = "NaN";
            if (scanner.hasNextLine()) {
                firstName = scanner.next();
            }
            System.out.print("Input last name: ");
            String lastName = "NaN";
            if (scanner.hasNextLine()) {
                lastName = scanner.next();
            }
            System.out.print("Input the year of birth: ");
            int birthYear = 0;
            if (scanner.hasNextLine()) {
                birthYear = Integer.valueOf(scanner.next());
            }

            persons.add(new Person(firstName, lastName, birthYear));
            System.out.println("");
        }

      persons.stream()
              .map(s -> s.getLastName())
              .distinct()
              .sorted()
              .forEach(name-> System.out.println(name));
             
              
              
    }

}
