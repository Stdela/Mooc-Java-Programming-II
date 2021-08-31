/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.part11_03sensors_and_temperature;


public interface Sensor {
boolean isOn();    // returns true if the sensor is on
    void setOn();      // sets the sensor on
    void setOff();     // sets the sensor off
    int read();    // returns the value of the sensor if it's on
                       // if the sensor is not on, throw an IllegalStateException
}
