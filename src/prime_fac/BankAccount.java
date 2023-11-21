/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime_fac;

/**
 *
 * @author B13
 */
public class BankAccount {
   private double balance = 500.65;
         public void deposit (double amount)  {
         balance += amount;
         }
                              
                 
     public void withdraw (double amount)  {
         if (balance >= amount) {
             balance -= amount;
         } else {
             System.out.println("");   
             
         }
    
     }   
      public double getBalance(){
     
     return balance;
             }      
           
}
