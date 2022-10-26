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
public class youtub {
    public static void main(String[] args) {
        channel ch1=new channel();
        subscriber s1 =new subscriber("Hamraz");
         subscriber s2 =new subscriber("Wadood");
          subscriber s3 =new subscriber("Rafi");
           subscriber s4 =new subscriber("Faiz");
         
         ch1.subscribe(s1);
          ch1.subscribe(s2);
           ch1.subscribe(s3);
            ch1.subscribe(s4);
        
        s1.subscribe_channal(ch1);
        s2.subscribe_channal(ch1);
        s3.subscribe_channal(ch1);
        s4.subscribe_channal(ch1);
        
        
        ch1.upload("how to install hadoop");
        
        
    }
}
