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
public abstract class AbstructLogger {
    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERRoR=3;
    protected int level;
    protected AbstructLogger NextLogger;
    public void setNextLogger(AbstructLogger NextLogger){
        this.NextLogger=NextLogger;
    }
    public void LogMessage(int level, String Message){
        if(this.level<=level){
            write(Message);
        }
        else 
            System.out.println("level is high");
        if(NextLogger!=null){
            NextLogger.LogMessage(level, Message);
        }
        
    }

    abstract protected void write(String Message);
    
}
