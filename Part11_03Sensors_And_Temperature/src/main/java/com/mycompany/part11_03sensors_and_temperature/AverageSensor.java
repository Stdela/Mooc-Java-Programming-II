
package com.mycompany.part11_03sensors_and_temperature;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author delam
 */
public class AverageSensor implements Sensor {
List<Sensor> listSensors = new ArrayList<>();
List<Integer> readings = new ArrayList<>();

    public AverageSensor() {
    }
@Override
public void setOn(){
    for (Sensor listSensor : listSensors) {
        listSensor.setOn();
    }
}
@Override
public void setOff(){
    for (Sensor listSensor : listSensors) {
        listSensor.setOff();
    }
}
public void addSensor(Sensor toAdd){
    this.listSensors.add(toAdd);
}
@Override
public boolean isOn(){
  boolean aux1 = true;
    for (Sensor listSensor : listSensors) {
        if (listSensor.isOn()==false) {
            return false;
        }
        }
    return aux1;
    }

@Override
public int read(){
    if (this.isOn()==true && !(this.listSensors).isEmpty()) {
    Double aux1 = this.listSensors.stream()
           .mapToInt(sensor->sensor.read())
            .average()
            .getAsDouble();
           
    int aux2 = (int) Math.round(aux1);
    return aux2;    
    } else{
        throw new IllegalArgumentException("All sensors should be turned on first.");
    }
    
          
}
public List<Integer> readings(){
    
    
    return this.readings;
}
}
