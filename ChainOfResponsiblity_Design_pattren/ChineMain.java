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
public class ChineMain {
    private static AbstructLogger getChainOfLoggers(){
        AbstructLogger errloger=new ErrorLogger(4);
        AbstructLogger fileloger=new fileLogger(1);
        AbstructLogger consolloger=new consolLogger(1);
        errloger.setNextLogger(fileloger);
        fileloger.setNextLogger(consolloger);
        return errloger;
        
    }
    public static void main(String[] args) {
        AbstructLogger loggerchai=getChainOfLoggers();
        loggerchai.LogMessage(AbstructLogger.INFO, "this is an information");
        System.out.println(" ");
        loggerchai.LogMessage(AbstructLogger.DEBUG, "this is an debug");
        System.out.println(" ");
        loggerchai.LogMessage(AbstructLogger.ERRoR, "this is an error information");
        System.out.println(" ");
    }
    
}
