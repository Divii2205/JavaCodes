import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        char letter = 'A';

        for(int i=num;i>0;i--) {
            for (int j =0; j<i; j++){
                System.out.print(letter);
            }
            letter++;
            System.out.println();
        }
        sc.close();
    }
}