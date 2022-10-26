/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer_Design_pattren;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mohtamim
 */
public class channel implements Subject {
    private List<subscriber> subs =new ArrayList<>();
    public String title;
    
    @Override
    public void subscribe(subscriber sub){
        subs.add(sub);
    }
    @Override
     public void unsubscribe(subscriber sub){
        subs.remove(sub);
    }
    @Override
    public void notify1(){
        for(subscriber sub:subs){
            sub.update();
        }
    }
    @Override
    public void upload(String title){
        this.title=title;
        notify1();
    }
}
