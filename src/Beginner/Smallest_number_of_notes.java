package Beginner;

import java.util.Scanner;

import static java.lang.System.exit;

public class Smallest_number_of_notes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notes = sc.nextInt();
        int count = 0;
        int[] currency = {100, 50, 10, 5, 2, 1};
        for (int i = 0; i < currency.length; i++) {
            if (notes >= currency[i]) {
                count += (notes / currency[i]);
                notes = notes % currency[i];
            }
            if (notes == 0) {
                System.out.println(count);
                exit(0);
            }
        }
    }
}
