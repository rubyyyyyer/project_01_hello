package guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumFor {
    public static void main(String[] args) {
/*        int sum = 0;

        for (int i=1; i<=100; i++){
            sum = i + sum;
        }
        System.out.println(sum);*/
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNum = random.nextInt(10) + 1;
        System.out.println("秘密數字是:" + secretNum);
        int userInput = 0;
        int counter = 5;

        for (int i = 1; i <= counter; i++) {
            System.out.println("請輸入一個數字(" + i + "/" + counter + "):");
            userInput = scanner.nextInt();
            System.out.println("第" + i + "次，輸入" + userInput);
            if (i != counter) {
                if (userInput > secretNum) {
                    System.out.println("小一點");
                } else if (userInput < secretNum) {
                    System.out.println("大一點");
                } else {
                    System.out.println("恭喜答對!就是" + secretNum);
                    break;
                }
            } else {
                System.out.println("哎呀!都沒有答對!");
            }
        }
    }
}
