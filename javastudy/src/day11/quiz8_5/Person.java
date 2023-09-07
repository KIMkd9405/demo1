package day11.quiz8_5;

public class Person {
    private String name;
    private int age;
    private Die[] dies;

    public void smile(){
        System.out.println("웃다");
    }

    public void eat(){
        System.out.println("먹다");
    }

    public void setDie(Die[] dies){
        this.dies =dies;
    }

 public void rollDies(){
     for (int i= 0; i < dies.length; i++) {
         dies[i].roll();
 }
    }

    public Die[] getDies() {
        return dies;
    }
}
