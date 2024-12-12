package Trimester2;
import java.util.Scanner;

public class EvenNoQuery {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i<N; i++) arr[i] = sc.nextInt();

        int[] newArr = new int[N]; // Prefix Sum Array
        int even = 0;
        
        for (int i = 0; i<N; i++){
            if (arr[i]%2 == 0) even++;
            newArr[i] = even;
        }

        int Q = sc.nextInt();

        while (Q-->0){
            int s = sc.nextInt();
            int e = sc.nextInt();
            
            if(s==0) System.out.println(newArr[e]);
            else System.out.println(newArr[e] - newArr[s-1]);
        }        
    }
}
