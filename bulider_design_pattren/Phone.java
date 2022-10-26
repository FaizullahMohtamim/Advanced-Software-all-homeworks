/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulider_design_pattren;

/**
 *
 * @author Mohtamim
 */
public class Phone {
    private String os;
    private String processor;
    private double screenSize;
    private int bettry;
    private int camera;

    public Phone(String os, String processor, double screenSize, int bettry, int camera) {
        this.os = os;
        this.processor = processor;
        this.screenSize = screenSize;
        this.bettry = bettry;
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Phone{" + "os=" + os + ", processor=" + processor + ", screenSize=" + screenSize + ", bettry=" + bettry + ", camera=" + camera + '}';
    }
    public static class PhoneBulider{
         private String os;
    private String processor;
    private double screenSize;
    private int bettry;
    private int camera;

        public PhoneBulider setOs(String os){
            this.os=os;
            return this;
        }
        public PhoneBulider setprocessor(String processor){
            this.processor=processor;
            return this;
        }
         public PhoneBulider setscreenSize(double screenSize){
            this.screenSize=screenSize;
            return this;
        }
         public PhoneBulider setbettry(int bettry){
            this.bettry=bettry;
            return this;
        }
          public PhoneBulider setcamera(int camera){
            this.camera=camera;
            return this;
        }
         public Phone getPhone(){
             return new Phone(os, processor, screenSize, bettry, camera);
         }
        
    }
}
    
