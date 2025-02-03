import java.util.Scanner;

public class ContinuousSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i<n; i++) a[i] = sc.nextInt();

        int[] ps = new int[n];

        int q = sc.nextInt();

        while(q-->0){
            int index = sc.nextInt();
            int value = sc.nextInt();

            ps[index] = value;
        }

        for(int i = 1; i<n; i++) ps[i] += ps[i-1];

        for(int i = 0; i<n; i++) ps[i] += a[i];

        for(int i = 0; i<n; i++) System.out.print(ps[i] + " ");
    }
}
