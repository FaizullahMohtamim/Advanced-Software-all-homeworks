/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter_Design_Pattren;

/**
 *
 * @author Mohtamim
 */
class Volt {
    private int volts;

    public Volt(int volts) {
        this.volts = volts;
    }
    public int getVolt(){
        return this.volts;
    }

    @Override
    public String toString() {
        return "Volt{" + "volts=" + volts + '}';
    }
    
}
