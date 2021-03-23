package Beginner;

import java.util.Scanner;

public class gross_salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        if (salary < 1500) {
            double HRA = salary * .1;
            double DA = salary * .9;
            double totalsalary = salary + HRA + DA;
            System.out.println(totalsalary);
        } else {
            double HRA = 500;
            double DA = salary * .98;
            double totalsalary = salary + HRA + DA;
            System.out.println(totalsalary);
        }
    }
}
