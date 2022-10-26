/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChainOfResponsiblity_Design_pattren;

/**
 *
 * @author Mohtamim
 */
public class consolLogger extends AbstructLogger{

    public consolLogger(int level) {
        this.level=level;
    }

   
    
    
    
    @Override
    protected void write(String Message) {
        System.out.println("Standred consol :: Logger: "+Message);
    }
    
}
