package Beginner;

import java.util.Scanner;

public class enormous_input_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int divider=sc.nextInt();
        int count=0;
        for (int i = 0; i < n ; i++) {
            int input=sc.nextInt();
            if (input % divider == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
