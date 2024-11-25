import java.util.*;

public class Factors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int div = 1; div*div<=N; div++){
            if (N%div == 0){
                if (div == (N/div)){
                    System.out.print(div + " ");
                } else {
                    System.out.print(div + " " + (N/div) + " ");
                }
            }
        }

        System.out.println();
        sc.close();
    }
}