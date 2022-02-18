/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classchapter;

import java.util.Random;

/**
 *
 * @author ODINGA
 */
public class GuessGame {
    private final String username;
    private int generatedNumber;
    private Random rn;
    private int right;
    private int wrong;

    public int getTrialtime() {
        return trialtime;
    }

    public void setTrialtime() {
        this.trialtime++;
    }
    private int trialtime;
    
    public GuessGame(String username){
        this.username = username;
        welcomeUser();
    }

    public int getRight() {
        return right;
    }

    public int getWrong() {
        return wrong;
    }

    private void welcomeUser() {
        System.out.printf("Welcome, %s to my guess game\n",this.username);
    }
    
    public int generateNumber(int gn){
//        this.rn = new Random();
        generatedNumber = gn;
        return generatedNumber;
    }
    
    public boolean compareNumber(int guessnumber){
        if(this.generatedNumber==guessnumber){
            right++;
            return generatedNumber==guessnumber;
        }else{
            wrong++;
            return generatedNumber==guessnumber;
        }
    }   
}
