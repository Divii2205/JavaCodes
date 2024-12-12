package Trimester2;

import java.util.Scanner;

public class Queries {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();

        // int[] arr = new int[N];

        // for (int i = 0; i<N; i++) arr[i] = sc.nextInt();

        // int Q = sc.nextInt();

        // while (Q-->0){
        //     int s = sc.nextInt();
        //     int e = sc.nextInt();

        //     int sum = 0;

        //     for (int i = s; i<=e; i++){
        //         sum += arr[i];
        //     }
            
        //     System.out.println(sum);
        // }

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i<N; i++) arr[i] = sc.nextInt();

        int[] newArr = new int[N]; // Prefix Sum Array
        int sum = 0;
        
        for (int i = 0; i<N; i++){
            sum += arr[i];
            newArr[i] = sum;
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
