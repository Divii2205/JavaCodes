import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=1;i<=num;i++) {
            for (int j = 1; j<=i; j++) 
                System.out.print(j);
            
            for (int j = 0; j<2*(num-i);j++)
                System.out.print(" ");

            for (int j = i; j>0; j--)
                System.out.print(j);

            System.out.println();
        }
        sc.close();
    }
}