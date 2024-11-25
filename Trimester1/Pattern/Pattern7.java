import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i <num; i++){
            for (int j = 0; j < num-i-1; j++) System.out.print(" ");
            for (int j = 1; j <= 2*i+1; j++) System.out.print("*");
            for (int j = 0; j < num-i-1; j++) System.out.print(" ");

            System.out.println();
        }

        for (int i = num; i >0; i--){
            for (int j = 0; j < num-i; j++) System.out.print(" ");
            for (int j = 1; j <= 2*i-1; j++) System.out.print("*");
            for (int j = 0; j < num-1; j++) System.out.print(" ");

            System.out.println();
        }
        sc.close();
    }
}
