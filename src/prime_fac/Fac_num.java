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
public class Fac_num {
   public static int Fac(int n){
     if(n==0){
     return 1; 
     }  
       int sum = 1;
            for (int i = 1; i <= n; i++) {
            sum *= i;    
            }
          return sum;  
     } 
   public static void main(String[] args){
   
            System.err.println("Factorial value:" + Fac(5));
   }
}
