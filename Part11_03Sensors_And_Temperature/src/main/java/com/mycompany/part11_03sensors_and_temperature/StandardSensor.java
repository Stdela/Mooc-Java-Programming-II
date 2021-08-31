
package com.mycompany.part11_03sensors_and_temperature;

/**
 *
 * @author delam
 */
public class StandardSensor implements Sensor{
public int standarParameter;

    public StandardSensor() {
    }

    public StandardSensor(int standarParameter) {
        this.standarParameter = standarParameter;
    }

    public int getStandarParameter() {
        return standarParameter;
    }

    public void setStandarParameter(int standarParameter) {
        this.standarParameter = standarParameter;
    }

    @Override
    public String toString() {
        return "StandarSensor{" + "standarParameter=" + standarParameter + '}';
    }
@Override
public boolean isOn(){
    return true;
}
@Override
public void setOn(){
    
}
@Override
public void setOff(){
    
}
@Override
public int read(){
    return this.standarParameter;
}
}
