package Beginner;
import java.util.*;
public class sums_in_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                int value = sc.nextInt();
                if (i!=0 && max < value) {
                    max=value;
                }
            }
            list.add(max);
            max=0;
        }
        int sum=0;
        for(int i=0; i<list.size(); i++){
            sum+=list.get(i);
        }
        System.out.println(sum);
    }
}
