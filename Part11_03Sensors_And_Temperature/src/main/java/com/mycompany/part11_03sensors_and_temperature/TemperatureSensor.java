
package com.mycompany.part11_03sensors_and_temperature;

import java.util.Random;


public class TemperatureSensor implements Sensor {
public boolean Sensor;

    public TemperatureSensor() {
    }

    public TemperatureSensor(boolean Sensor) {
        this.Sensor = Sensor;
    }
@Override
    public boolean isOn(){
        if (Sensor == true) {
            return true;
        } else{
            return false;
        }
    }
@Override
public void setOn(){
    this.Sensor = true;
}
@Override
public void setOff(){
    this.Sensor = false;
}
@Override
public int read(){
    if (this.Sensor == true) {
    int aux1 = new Random().nextInt(60-0)+0;
 return aux1;    
} else{
        throw new IllegalArgumentException("First must turn sensor on");
        }
    
}
}
