/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime_fac;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author B13
 */
public class As_Ds {
    public static void main(String[] args) {
    Integer [][] arrays = {
            {9, 5, 14, 3},
            {8, 4, 19, 10},
            {6, 7, 2, 18}
        };
        
        System.out.println("Assending arrays: ");
        for (Integer[] val : arrays) {
            Arrays.sort(val);
            System.out.println(Arrays.toString(val));
        }
        
        System.out.println("Dccending arrays: ");
        for (Integer[] val : arrays) {
            Arrays.sort(val, Collections.reverseOrder());
            System.out.println(Arrays.toString(val));
            
        }
        
        
        
    }
}
