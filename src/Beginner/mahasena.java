package Beginner;

import java.util.Scanner;

public class mahasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int shoulder=sc.nextInt();
        int[] even_odd = new int[2];
        while (shoulder --> 0) {
            if (sc.nextInt() % 2 == 0) {
                //even position
                even_odd[0]++;
            } else {
                even_odd[1]++;
            }
        }
        if (even_odd[0] > even_odd[1]) {
            System.out.println("READY FOR BATTLE");
        } else {
            System.out.println("NOT READY");
        }
    }
}
