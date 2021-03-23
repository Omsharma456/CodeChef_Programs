package Beginner;

import java.util.Scanner;

import static java.lang.System.exit;

public class primality_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = true;
        if (num == 0 || num == 1) {
            System.out.println("no");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
