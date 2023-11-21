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
public class Saving extends BankAccount {
    private double balance = 500.65;
    @Override
    public void withdraw (double amount){
        if (balance - amount < 100) {
            System.out.println("Minimum balance of $100 required!"); 
        } else {
          balance -=amount;  
        }
    }
    
    
}
