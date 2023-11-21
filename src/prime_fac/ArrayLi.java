/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime_fac;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author B13
 */
public class ArrayLi {
    
    public static void main(String[] args) {
       
       ArrayList<String> intArr = new  ArrayList<>();
        intArr.add("abc@gmail.com");
        intArr.add("dfh@gmail.com");
        intArr.add("sdg@gmail.com");
        intArr.add("dfh@gmail.com");
        intArr.add("rtu@gmail.com");
        intArr.add("ujk@gmail.com");
        intArr.add("dss@gmailcom");

        
        for (int i = 0; i <intArr.size(); i++) {
            for (int j = 0; j < 10; j++) {
                
            }
            if (intArr.get(i).contains("@")&& intArr.get(i).contains(".")) {
             
                System.out.println("True" +intArr.get(i));    
            } else {
                     System.out.println("False" +intArr.get(i)); 
            }
          
        }
         for(String strig : intArr)
              if (strig.contains("@")&& strig.contains(".")) {
             
                System.out.println("True" +strig);    
            } else {
                     System.out.println("False" +strig); 
            }
       
        }
    
        }
        
    
