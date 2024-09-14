/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Keempat;

/**
 *
 * @author acer_user
 */
public class Throws {
  public static void checknilai(int nilai) throws ArithmeticException {
    if (nilai < 70) {
      throw new ArithmeticException("nilai tidak memenuhi kkm ");
    }
    else {
      System.out.println("nilai mencukupi ");
    }
  }

  public static void main(String[] args) {
    checknilai(50); 
  }

}
