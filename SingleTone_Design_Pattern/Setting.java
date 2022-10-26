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
public  class Setting {
    private static Setting instSance;
    public static String tehem="light";
    public static String font="Bold";
    private Setting(){
    }

    /**
     *
     * @return
     */
    public static Setting getInstance(){
      if (instSance==null){
           synchronized(Setting.class){
               if (instSance==null){
                   instSance=new Setting();
               }
           }
       } 
       
       return instSance;
    }
    
}
