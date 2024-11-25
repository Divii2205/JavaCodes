import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        
        for (int i = num; i>0; i--){
            for (int j=0; j<i; j++)
                System.out.print("*");
            
            for (int j = 0; j < 2*(num-i); j++)
                System.out.print(" ");
            
            for (int j=0; j<i; j++)
                System.out.print("*"); 

            System.out.println();
        }

        for (int i = 1; i<=num; i++){
            for (int j=0; j<i; j++)
                System.out.print("*");
            
            for (int j = 0; j < 2*(num-i); j++)
                System.out.print(" ");
            
            for (int j=0; j<i; j++)
                System.out.print("*"); 

            System.out.println();
        }

        sc.close();
    }
}
