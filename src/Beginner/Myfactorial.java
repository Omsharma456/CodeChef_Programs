package Beginner;

import java.util.ArrayList;
import java.util.Scanner;

public class Myfactorial {
    public static int factorial(int num) {
        int fact=1;
        if (num == 0 && num == 1) {
            return fact;
        } else {
            while (num != 1) {
                fact*=num;
                num--;
            }
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num=sc.nextInt();
            list.add(factorial(num));
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
