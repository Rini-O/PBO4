/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Keempat;

import java.util.Scanner;

/**
 *
 * @author acer_user
 */
public class RaraException extends ArithmeticException { 

   public RaraException(String s) {
        super(s);
    }

    public static void kaliTryCatch(int a, int b) {
        try {
            if (a > 0 && b > 0 && a > Integer.MAX_VALUE / b) {
                throw new RaraException("FAILED: Overflow pada perkalian");  // Cek apakah hasil perkalian akan overflow
          
            }
    
            int hasil = a * b;  // Melakukan perkalian
            System.out.println("Hasil: " + hasil);
        } catch (RaraException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        RaraException.kaliTryCatch(2000000000, 2); //overflow
   //     RaraException.kaliTryCatch(10, 5); 
    }
  
}
