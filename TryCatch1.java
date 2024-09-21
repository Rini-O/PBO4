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
public class TryCatch1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Masukkan angka pertama: ");
            int num1 = sc.nextInt(); 
            System.out.println("Masukkan angka kedua: ");
            int num2 = sc.nextInt(); 

            // Melakukan perkalian
            int result = multiply(num1, num2); // Memanggil metode perkalian
            System.out.println("Hasil perkalian: " + result);
        } catch (ArithmeticException e) {
            System.err.println("FAILED !!!" + e.getMessage());
        } catch (Exception e) {
            System.err.println("Input harus menggunakan angka.");
       
        }
    }
 public static int multiply(int a, int b) {
      
        if (a != 0 && b != 0 && (Integer.MAX_VALUE / a < b)) {
            throw new ArithmeticException("Hasil perkalian terlalu besar.");
        }
        return a * b; 
    }
  
}
