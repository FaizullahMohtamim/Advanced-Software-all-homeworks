package calculation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohtamim
 */
public class Context {  
  
       private Strategy strategy;  
       
       public Context(Strategy strategy){  
          this.strategy = strategy;  
       }  
  
       public float executeStrategy(float num1, float num2){  
          return strategy.calculation(num1, num2);  
       }  
}// End of the Context class. 
