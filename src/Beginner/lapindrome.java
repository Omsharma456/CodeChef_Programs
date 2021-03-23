package Beginner;

import java.util.Arrays;
import java.util.Scanner;

public class lapindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String new1="";
        String new2="";
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];
        if (s.length() % 2 == 0) {
            new1 = s.substring(0, s.length() / 2);
            new2 = s.substring((s.length() / 2), s.length());
        } else {
            new1 = s.substring(0, s.length() / 2);
            new2 = s.substring((s.length() / 2)+1, s.length());
        }
        for (int i = 0; i < new1.length(); i++) {
            int ascii1=new1.charAt(i);
            arr1[ascii1]++;
            int ascii2=new2.charAt(i);
            arr2[ascii2]++;
        }
        int count=0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != 0 && arr1[i]==arr2[i]) {
                count++;
            }
        }
        if (count == new1.length()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
