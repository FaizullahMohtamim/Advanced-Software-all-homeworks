/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory_Design_Pattren;

/**
 *
 * @author Mohtamim
 */
public class Laptop {
     private String ram;
    private String cpu;
    private String hdd;
    boolean isgraphicsenabled;
    boolean isBluetoothenabled;

    public Laptop(String ram, String cpu, String hdd, boolean ISgraphicsenabled, boolean IsBluetoothenabled) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
        this.isgraphicsenabled = ISgraphicsenabled;
        this.isBluetoothenabled = IsBluetoothenabled;
    }
    

    public String Ram() {
        return this.ram;
    }

    public String HDD() {
           return this.hdd;
    }

    public String CPU() {
     return this.cpu;
    }

    
    public boolean ISgraphicsenabled() {
     return this.isBluetoothenabled;
    }

    public boolean IsBluetoothenabled() {
      return this.isBluetoothenabled;
    }
      public String toString(){
       return "LAPTOP[RAM= " + ram + "HDD= " + hdd + "CPU= " + cpu + "ISgraphicsenabled= " + isgraphicsenabled 
               + "IsBluetoothenabled= "+isBluetoothenabled+"]";
       
   } 
}
