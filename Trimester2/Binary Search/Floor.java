import java.util.Scanner;

public class Floor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int t = sc.nextInt();

        System.out.println(floor(a, t));
    }

    static int floor(int[] a, int t){
        int n = a.length;  
        int s = 0;
        int e = n-1;

        int max = Integer.MIN_VALUE;

        while(s<=e){
            int mid = (s+e)/2;
            if(a[mid] == t) return t;
            else if(a[mid]>t){
                e = mid-1;
            } else {
                s = mid+1;
                max = Math.max(a[mid], max);
            }
        }

        return max;
    } 
}
