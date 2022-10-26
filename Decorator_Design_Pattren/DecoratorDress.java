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
public class DecoratorDress implements Dress {
    private Dress dress;

    public DecoratorDress(Dress dress) {
        this.dress = dress;
    }
    
    @Override
    public void assamble() {
        this.dress.assamble();
    }
}
