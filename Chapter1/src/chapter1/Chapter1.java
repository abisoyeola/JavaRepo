/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter1;

import java.util.Scanner;

/**
 *
 * @author ODINGA
 */
public class Chapter1 {

    /**
     * @param args the command line arguments
     */
    static int num2;
        static int num1;
    
    public static void main(String[] args) {
        
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Welcome to My 2 Numbers Addition Program");  
        System.out.print("Enter Number 1 and Press Enter Key: ");
        num1=input.nextInt();
        System.out.print("Enter Number 2 and Press Enter Key: ");
        num2=input.nextInt();
        System.out.print("Answer = ");
        System.out.println(num1+ num2);
    }    
    
}
