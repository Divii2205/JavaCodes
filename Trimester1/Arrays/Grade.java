import java.util.*;

public class Grade {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // 1. Method 1
        // int m1 = sc.nextInt();
        // int m2 = sc.nextInt();
        // int m3 = sc.nextInt();
        // int m4 = sc.nextInt();        
        // int m5 = sc.nextInt();
        // if conditional statements <here>

        // 2. Method 2
        // int sum = 0;
        // for (int i = 1; i <= 5; i++){
        //     int m = sc.nextInt();

        //     if (m>=95) System.out.println("A*");
        //     else if (m>=90) System.out.println("A");
        //     else if (m>=80) System.out.println("B");

        //     sum += m;
        // }
        // System.out.println(sum/5.0);

        // 3. Arrays --- collection of same type of data --- helps avoid redundancy in code
        int nOE = sc.nextInt();
        int[] marks = new int[nOE];

        int sum = 0;

        for (int i = 0; i<nOE; i++){
            int m = sc.nextInt();
            marks[i]=m;
        }

        for (int i = 0; i < marks.length; i++){
            if (marks[i]>=95) System.out.println("marks[" + i + "]" + "A*");
            else if (marks[i]>=90) System.out.println("marks[" + i + "]" + "A");
            else if (marks[i]>=80) System.out.println("marks[" + i + "]" + "B");

            sum += marks[i];
        }

        System.out.println(sum/5.0);
        sc.close();
    }
}
