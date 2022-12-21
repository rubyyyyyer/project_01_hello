package org.example;

public class HelloJava {
    public static void main(String[] args) {
//        System.out.println("Hello Java!");
//        new Girl().Hello();
        String s = "abcde";
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.substring(3));
        System.out.println(s.substring(1,4));

        String s2 = null;
        System.out.println(s2.length());

        Girl g=new Girl("Ruby",65.5f,1.8f);
        g.hello();
        g.weight = 65.5f;
        g.height = 1.8f;
        System.out.println(g.bmi());
    }
}
