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
public class PC implements Computer{
    private String ram;
    private String cpu;
    private String hdd;
    boolean isgraphicsenabled;
    boolean isBluetoothenabled;

    public PC(String ram, String cpu, String hdd, boolean ISgraphicsenabled, boolean IsBluetoothenabled) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
        this.isgraphicsenabled = ISgraphicsenabled;
        this.isBluetoothenabled = IsBluetoothenabled;
    }
    

    @Override
    public String Ram() {
        return this.ram;
    }

    @Override
    public String HDD() {
           return this.hdd;
    }

    @Override
    public String CPU() {
     return this.cpu;
    }

    
    @Override
    public boolean ISgraphicsenabled() {
     return this.isgraphicsenabled;
    }

    @Override
    public boolean IsBluetoothenabled() {
      return this.isBluetoothenabled;
    }
   public String toString(){
       return "PC[RAM= " + ram + "HDD= " + hdd + "CPU= " + cpu + "ISgraphicsenabled= " + isgraphicsenabled 
               + "IsBluetoothenabled= "+isBluetoothenabled+"]";
       
   } 
}
