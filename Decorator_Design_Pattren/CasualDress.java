/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator_Design_Pattren;

/**
 *
 * @author Mohtamim
 */
public class CasualDress extends DecoratorDress {

    BasicDress dress;

    public CasualDress(Dress dress) {
        super(dress);
    }

    public void assamble() {
        super.assamble();
        System.out.println("adding CasualDress features ");
    }

    public double cost() {
        return dress.cost() + 50;
    }
}
