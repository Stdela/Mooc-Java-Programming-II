
package com.mycompany.part11_03sensors_and_temperature;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
    Sensor kumpula = new TemperatureSensor();
    Sensor kaisaniemi = new TemperatureSensor();
    Sensor helsinkiVantaaAirport = new TemperatureSensor();

    AverageSensor helsinkiRegion = new AverageSensor();
    helsinkiRegion.addSensor(kumpula);
    helsinkiRegion.addSensor(kaisaniemi);
    helsinkiRegion.addSensor(helsinkiVantaaAirport);

    helsinkiRegion.setOn();
    System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
    System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
    System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
// Missing how to return the results of all the executed readings that the average sensor has done as a list
//    System.out.println("readings: " + helsinkiRegion.readings());
}
}
    


