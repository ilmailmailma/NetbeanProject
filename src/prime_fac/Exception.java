/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime_fac;

import java.util.Scanner;

/**
 *
 * @author B13
 */
public class Exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
        int x,y,result;
        x = input.nextInt();
                y = input.nextInt();
                result = x/y;
                System.out.println("Sum of x and y:" + result);
        }catch (ArithmeticException e){
            System.out.println("Exception" +e);
        }finally{
            System.out.println("Continue Execution");


    }
}
}