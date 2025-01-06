import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int t = sc.nextInt();

        System.out.println(binarySearch(a, t));
    }

    static int binarySearch(int[] a, int t){
        int n = a.length;
        int s = 0;
        int e = n-1;

        while(s<=e){
            int mid = (s+e)/2;
            if(a[mid] == t) return mid;
            else if(a[mid]>t) e = mid-1;
            else s = mid+1;
        }

        return -1;
    }
}
