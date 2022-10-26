/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bulider_design_pattren.bulider2;

/**
 *
 * @author Mohtamim
 */
public class builderMain {
    public static void main(String[] args) {
        vehicle car=new vehicle.vehicleBuilder("1500", 4).setairbags(3).Build();
        vehicle bike=new vehicle.vehicleBuilder("250", 2).Build();
        System.out.println(car.getEngine());
         System.out.println(car.getWheel());
          System.out.println(car.getAirbags());
          System.out.println(" ");
           System.out.println(bike.getEngine());
            System.out.println(bike.getWheel());
          System.out.println(bike.getAirbags());
    }
}
