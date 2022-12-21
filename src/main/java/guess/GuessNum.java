package guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNum = random.nextInt(10) + 1;
        System.out.println("秘密數字是：" + secretNum);

        int inputNum = 0;

        while (secretNum != inputNum) {
            System.out.print("請輸入一個數字：");
            inputNum = scanner.nextInt();
            if (inputNum > secretNum) {
                System.out.println("小一點");
            } else if (inputNum < secretNum) {
                System.out.println("大一點");
            } else {
                System.out.println("答對了!就是" + secretNum);
            }
        }
    }
}
