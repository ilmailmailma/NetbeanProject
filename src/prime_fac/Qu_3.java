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
public class Qu_3 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        
         double max = getMax(getMax(num1, num2), num3);
        double min = getMin(getMin(num1, num2), num3);;

        System.out.println("The lowest number is: " + min);
        System.out.println("The highest number is: " + max);
        
        getMax(5,9);
        getMax(9, 3);
        getMax(getMax(30,9), 10);
        
    }

    public static double getMax(double a, double b) {
        return a > b ? a : b;
    }

    public static double getMin(double a, double b) {
        return a < b ? a : b;
        
        
        
        
    }
}
