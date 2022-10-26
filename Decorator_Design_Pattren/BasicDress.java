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
public abstract class BasicDress implements Dress {

    @Override
    public void assamble() {
        System.out.println("basic dress");
    }
        public abstract  double cost();

}
