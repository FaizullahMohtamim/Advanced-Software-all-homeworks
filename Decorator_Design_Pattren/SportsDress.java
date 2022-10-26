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
public class SportsDress extends DecoratorDress {
    BasicDress dress;
    public SportsDress(Dress dress) {
        super(dress);
    }
    public void assamble(){
        super.assamble();
        System.out.println("adding sports dress features");
    }

public double cost() {
       return dress.cost()+200;
    }    }
    

