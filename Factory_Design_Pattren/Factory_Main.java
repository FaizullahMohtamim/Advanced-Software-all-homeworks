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
public class Factory_Main {

    public static void main(String[] args) {
        Computer PC = ComputerFactory.getComputer(computerType.LAPTOP, "8 GB", "500 SSD", "2.9 ghh", true, true);
        System.out.println("pc config " + PC);
        Computer LAPTOP = ComputerFactory.getComputer(computerType.LAPTOP, "16 GB", "500 SSD", "2.9 ghh", true, true);
        System.out.println("pc config " + LAPTOP);
        Computer SERVER = ComputerFactory.getComputer(computerType.LAPTOP, "32 GB", "500 SSD", "2.9 ghh", true, true);
        System.out.println("pc config " + SERVER);
    }
}
