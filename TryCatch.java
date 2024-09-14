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
public class TryCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("masukkan NIM : ");
            int contoh = sc.nextInt();
        } catch (Exception e) {
            System.err.println("NIM harus berupa angka");
        }
    }

}
