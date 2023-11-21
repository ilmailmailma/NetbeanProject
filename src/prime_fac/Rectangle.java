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
public class Rectangle extends Shape {
   public double getArea(int a, double b){
   double area =a*a*b;
       System.out.println(area);
       return 0.0;
   }
    public static void main(String[] args) {
        Shape he =new Rectangle();
        he.getArea(6, 3.1415);
    }
   
}
