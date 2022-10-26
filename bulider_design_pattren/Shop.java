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
public class Shop {
    public static void main(String[] args) {
    Phone.PhoneBulider bulider=new Phone.PhoneBulider();
    bulider.setOs("corei7");
    Phone p=bulider.getPhone();
        System.out.println(p);
    }
}
