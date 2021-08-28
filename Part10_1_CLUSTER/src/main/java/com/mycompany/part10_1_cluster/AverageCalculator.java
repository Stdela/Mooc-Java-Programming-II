
package com.mycompany.part10_1_cluster;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class AverageCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<String> averageNumbers = new ArrayList<>();
    while(true){
     String numbers = scanner.nextLine();
        if (numbers.equals("end")) {
            break;
            
        }
        averageNumbers.add(numbers);
        
    }
  double average = averageNumbers.stream()
          .mapToInt(s -> Integer.valueOf(s))
          .average()
          .getAsDouble();
        System.out.println("Average number " + average);          
    }

}
