package Beginner;

import java.util.Scanner;

public class total_expenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            int quan=sc.nextInt();
            int price=sc.nextInt();
            double total=((quan*price));
            if (quan > 1000) {
                double amount = (double) (total - (0.1 * total));
                String myformat = String.format("%.6f", amount);
                System.out.println(myformat);
            } else {
                String myformat=String.format("%.6f",total);
                System.out.println(myformat);
            }
        }
    }
}
