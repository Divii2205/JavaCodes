import java.util.Scanner;

public class Functions {
    public static long Factorial(int N){
        long fact = 1;
        while (N>=1){
            fact *= N;
            N--;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        System.out.println(Factorial(inp));

        // int[] A = {1, 2, 3};
        // printValue(A);
        // System.out.println(A[0]);

        sc.close();
    }
    // static void printValue(int[] A){
    //     System.out.println(A[0]);
    //     A[0] = 100;
    //     System.out.println(A[0]);
    // }

}
