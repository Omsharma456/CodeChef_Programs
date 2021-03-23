package Beginner;

import java.util.Scanner;

public class Ceil_and_reciept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int totalbill = sc.nextInt();
            int count = 0;
            while (totalbill != 0) {
                for (int i = 0; i <= totalbill; i++) {
                    if (Math.pow(2, i) > totalbill) {
                        totalbill -= (Math.pow(2, i)) / 2;
                        count++;
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }

}
