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
public class DressTest {
    public static void main(String[] args) {
         BasicDress dress = null;
       BasicDress dr=new FancyDress(dress);
       dr.assamble();
        System.out.println(dr.cost());
    }
}