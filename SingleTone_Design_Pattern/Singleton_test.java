/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleTone_Design_Pattern;

/**
 *
 * @author Mohtamim
 */
public class Singleton_test {
    public static void main(String[] args) {
        LoginPage lg=new LoginPage();
        lg.Foo();
        HomePage ho=new HomePage();
        ho.Foo();
        About Ab=new About();
        Ab.Foo();
    }
}
