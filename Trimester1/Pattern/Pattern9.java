import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i=1;i<=num;i++) {
            for(int j=i;j>=1;j--) {
                System.out.print(j%2 + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}