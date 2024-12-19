package TestRevise.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class CumulativeSumQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ans = new int[n];

        int[] alt = new int[n];

        int q = sc.nextInt();
        while(q-->0){
            int s = sc.nextInt();
            int e = sc.nextInt();
            int val = sc.nextInt();

            alt[s] += val;
            if (e != n-1) alt[e+1] -= val;
        }

        int sum = 0;
        for(int i = 0; i<n; i++){
            sum += alt[i];
            ans[i] += sum;
        }

        System.out.println(Arrays.toString(ans));
    }
}
