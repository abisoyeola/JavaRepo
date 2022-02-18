/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayclass;

import java.util.Scanner;

/**
 *
 * @author ODINGA
 */
public class ArrayClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ScoreProcess p = new ScoreProcess();
        
        final int len = 2;
        
        Scanner input = new Scanner(System.in);
        String name[] = new String[len];
        short age[] = new short[len];
        float eng[] = new float[len];
        float math[] = new float[len];
        float phy[] = new float[len];
        double total[] = new double[len];
        
        for (int i = 0; i < len; i++) {
            System.out.println("Enter name for student "+ (i+1));
            name[i] = input.nextLine();
            p.setName(name[i]);
            
            System.out.println("Enter age for student "+ (i+1));
            age[i] = input.nextShort();
            p.setAge(age[i]);
            
            System.out.println("Enter math score for student "+ (i+1));
            math[i] = input.nextFloat();
            p.setMaths(math[i]);
            
            System.out.println("Enter eng score for student "+ (i+1));
            eng[i] = input.nextFloat();
            p.setEnglish(eng[i]);
            
            System.out.println("Enter phy score for student "+ (i+1));
            phy[i] = input.nextFloat();
            p.setPhysics(phy[i]);
            total[i] = p.getScore(p.getMaths(),p.getEnglish(),p.getPhysics());
            
        }
        
        for (int i = 0; i < len; i++) {
            System.out.println("Student Name : "+name[i]+"\nMath Score : "+math[i]+"\nEng Score : "+eng[i]+"\nPhy Score : " + phy[i] + "\nTotal : "+total[i]);
        }
    }
    
}
