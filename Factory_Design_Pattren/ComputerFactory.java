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
public class ComputerFactory {

    private ComputerFactory() {

    }

    public static Computer getComputer(computerType comType, String ram, String Hdd, String cpu, boolean isgraphisenabled, boolean isblutoothenabled) {
        switch (comType) {
            case PC:
                return new PC(ram, cpu, Hdd, isblutoothenabled, isgraphisenabled);
            case LAPTOP:

                return new PC(ram, cpu, Hdd, isblutoothenabled, isgraphisenabled);

            case SERVER:
                return new PC(ram, cpu, Hdd, isblutoothenabled, isgraphisenabled);
                
            default:
                throw new RuntimeException("invalid computer type !!!! ");
        }
    }
}
