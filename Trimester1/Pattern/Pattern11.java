import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int count = 1;
        for(int i=1;i<=num;i++) {
            for (int j = 0; j<i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
}