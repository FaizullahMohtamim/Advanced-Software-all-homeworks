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
public class FancyDress extends BasicDress{
     
    BasicDress dress;
    public FancyDress(BasicDress dress) {
        this.dress=dress;
    }
    
    public void assamble(){
        super.assamble();
        System.out.println("adding Fancy Dress features");
    }

    public double cost() {
       return dress.cost()+100;
    }
    
}   

