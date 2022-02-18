/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classchapter;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ODINGA
 */
public class ClassChapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your Name: ");
        String name = input.nextLine();
        
        GuessGame g1 = new GuessGame(name);
        Random rn = new Random();
        int n =1+ rn.nextInt(10);
        for (int i = 0; i < 5; i++) {
            g1.generateNumber(n);
            System.out.println("Guess A number between 1 and 10");
            int gun = input.nextInt();
            boolean isCorrect = g1.compareNumber(gun);
            
            if(isCorrect){
                System.out.println("Bravo!, Thats Correct");
                break;
            }else{
                System.out.printf("Ooops! That's wrong, %d of 5 trials \n", i);
            }
            g1.setTrialtime();
            n =1+ rn.nextInt(10);
        }
        
        System.out.printf("Played %d Time(s) Number of Wrong(s) = %d\n",n,g1.getTrialtime(), g1.getWrong());
        
    }
    
}
