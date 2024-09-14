/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Keempat;

/**
 *
 * @author acer_user
 */
public class RiniException extends Exception {
     public RiniException(String s)
    {
        super(s);
    }
     
     public static void main(String args[])
    {
        try {    
            throw new RiniException("hayoo salah");
        }
        catch (RiniException ex) {
            System.out.println("Loh ya gabisa!"+String.valueOf(ex));
 
            
        }
    }
}
 

