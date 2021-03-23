package Beginner;

import java.util.Scanner;

public class tanu_and_head_bob {
    public static void sign(String s){
        s.toUpperCase();
        char[] arr=s.toCharArray();
        int countY=0;
        int countI=0;
        int countN=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='Y'){
                countY++;
            } else if (arr[i] == 'N') {
                countN++;
            } else {
                countI++;
            }
        }
        if (countN > 0 && countI == 0 && countY == 0) {
            System.out.println("NOT SURE");
        } else if (countI > 0) {
            System.out.println("INDIAN");
        } else {
            System.out.println("NOT INDIAN");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            String s=sc.next();
            sign(s);
        }

    }
}
