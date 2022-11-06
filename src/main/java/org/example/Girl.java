package org.example;

public class Girl {
    String name;
    Float weight;
    Float height;
    public float bmi(){
        float bmi = weight / (height*height);
        return bmi;
    }
    public void hello() {
        System.out.println("Girl say hello java!");
    }
}
