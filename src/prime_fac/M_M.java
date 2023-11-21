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
public class M_M {

    public static void minmax(double[] arr) {

        double max = arr[0];
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max:" + max);
        System.out.println("Max:" + min);
    }

    public static void main(String[] args) {

        double[] arr = {6, 34, 8, 99, 2};

        minmax(arr);

    }

}
