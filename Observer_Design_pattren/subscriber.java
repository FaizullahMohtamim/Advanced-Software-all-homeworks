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
public class subscriber implements observer {
    private String name;
    private channel channl=new channel();

    public subscriber(String name) {
        this.name = name;
    }
    
     
    @Override
    public void update(){
        System.out.println("Hey"+name+" video uploaded!!!: " + channl.title );
    }
    @Override
    public void subscribe_channal(channel ch){
        this.channl=ch;
    }
}
