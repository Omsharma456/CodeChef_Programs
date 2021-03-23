package Beginner;

import java.util.Scanner;

public class block_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int check = num;
            int reverse = 0;
            while (num != 0) {
                reverse = reverse * 10 + num % 10;
                num /= 10;
            }
            if (reverse == check) {
                System.out.println("wins");
            } else {
                System.out.println("loses");
            }
        }
}
