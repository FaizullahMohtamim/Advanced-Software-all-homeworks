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
public class About {
     public void Foo()
        {
          Setting set=Setting.getInstance();
         // Setting.tehem="dark";
          Setting.font="itlic";
            System.out.println(Setting.tehem);

        }
}
