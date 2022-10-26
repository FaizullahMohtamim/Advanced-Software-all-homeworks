/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer_Design_pattren;

/**
 *
 * @author Mohtamim
 */
public interface Subject {

    void notify1();

    void subscribe(subscriber sub);

    void unsubscribe(subscriber sub);

    void upload(String title);
    
}
