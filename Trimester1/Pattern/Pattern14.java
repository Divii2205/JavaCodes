import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        
        for (int i = 1; i<=num; i++){
            char letter = 'A';
            letter += num - i;

            for (int j = 0; j<i; j++){ 
                System.out.print(letter + " ");
                letter++;
            }
            System.out.println();
        }
        sc.close();
    }
}
