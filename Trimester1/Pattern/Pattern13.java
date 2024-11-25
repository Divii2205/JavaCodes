import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        
        for (int i = 1; i<=num; i++){
            char letter = 'A';
            for (int j = 0; j<num-i; j++) 
                System.out.print(" ");

            for (int j = i; j>0; j--){
                System.out.print(letter);
                letter++;
            }
            letter-=2;
            for (int j = i; j>1; j--){
                System.out.print(letter);
                letter--;
            }

            for (int j = 0; j<num-i; j++) 
                System.out.print(" ");
            System.out.println();
        }
        sc.close();
    }
}
