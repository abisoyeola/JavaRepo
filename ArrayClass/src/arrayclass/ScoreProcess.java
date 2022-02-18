package arrayclass;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ODINGA
 */
public class ScoreProcess {

    private  String name;
    private  short age;
    private float english;
    private float maths;
    private float physics;

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public float getMaths() {
        return maths;
    }

    public void setMaths(float maths) {
        this.maths = maths;
    }

    public float getPhysics() {
        return physics;
    }

    public void setPhysics(float physics) {
        this.physics = physics;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public short getAge() {
        return age;
    }

    public ScoreProcess() {
        greetingMessage();
    }

    private void greetingMessage() {
        System.out.println("Welcome to my Score Processing System"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Student Name : "+getName()+"\nMath Score : "+getMaths()+"\nEng Score : "+getEnglish()+"\nPhy Score : " +getPhysics();
    }
    
    public double getScore(double ...score){
        double total=0;
        for (int i = 0; i < score.length; i++) {
            total+=score[i];
        }
        return total;
    }
    
    public double getAveScore(double ...score){
        double total=0;
        for (int i = 0; i < score.length; i++) {
            total+=score[i];
        }
        return total/score.length;
    }
    
    
}
