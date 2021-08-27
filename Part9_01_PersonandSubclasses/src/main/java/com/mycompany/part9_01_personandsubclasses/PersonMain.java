package com.mycompany.part9_01_personandsubclasses;

import java.util.Scanner;
import java.util.ArrayList;

public class PersonMain {

    public static void main(String[]args) {
//Teacher ada = new Teacher(1200,"Ada Lovelace", "24 Maddox St. London W1S 2QN");
//Teacher esko = new Teacher(5400,"Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki" );
//System.out.println(ada);
//System.out.println(esko);
//
//Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
//
//int i = 0;
//while (i < 25) {
//  ollie.study();
//  i = i + 1;
//}
//System.out.println(ollie);
//    }
//    

    ArrayList<Person> persons = new ArrayList<Person>();
    persons.add(new Teacher(1200,"Ada Lovelace", "24 Maddox St. London W1S 2QN"));
    persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

    printPersons(persons);
}
    public static void printPersons(ArrayList<Person> persons){
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}

  
