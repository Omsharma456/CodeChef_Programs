/* package codechef; // don't place package name! */
package Beginner;

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class greedy_puppy {
    public static int greedyPuppy(int n, int k) {
        int remaining = n % k;
        return remaining;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t >= 1 && t <= 50) {
            while (t --> 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                if (n >= 1 && n <= 50 && k >= 1 && k <= Math.pow(10, 5)) {
                    int remain = greedyPuppy(n, k);
                    System.out.println(remain);
                }
            }
        }

    }
}
