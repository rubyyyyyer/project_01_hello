package org.example;

public class HelloJava {
    public static void main(String[] args) {
//        System.out.println("Hello Java!");
//        new Girl().Hello();
        Girl g=new Girl();
        g.hello();
        g.weight = 65.5f;
        g.height = 1.8f;
        System.out.println(g.bmi());
    }
}
