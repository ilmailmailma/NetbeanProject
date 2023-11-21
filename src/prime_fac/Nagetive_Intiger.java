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
public class Nagetive_Intiger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        System.out.println("");
        while(true){
        int input = scanner.nextInt();
        if (input == -1){
        break;
        }
        sum += input;
        }
        System.out.println(""+sum);
    }
}
