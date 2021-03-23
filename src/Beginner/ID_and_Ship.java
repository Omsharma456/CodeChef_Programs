package Beginner;

import java.util.*;

public class ID_and_Ship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String id = sc.next();
            if (id.equals("B") || id.equals("b")) {
                System.out.println("BattleShip");
            } else if (id.equals("C") || id.equals("c")) {
                System.out.println("Cruiser");
            } else if (id.equals("D") || id.equals("d")) {
                System.out.println("Destroyer");
            } else {
                System.out.println("Frigate");
            }
        }
    }
}