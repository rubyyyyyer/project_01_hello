package student;


import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {

        System.out.print("Enter name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("Enter math score:");
        int math = scanner.nextInt();
        System.out.print("Enter english score:");
        int english = scanner.nextInt();
        Student stu = new Student(name,math,english);
        stu.print();
        System.out.println(stu.getGrading());


    }

}

