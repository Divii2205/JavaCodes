
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int t = sc.nextInt();

        System.out.println(frequency(a, t));
    }
    // ------- log N + N ------
    // static int frequency(int[] a, int t){
    //     int n = a.length;
    //     int count = 0;

    //     int s = 0;
    //     int e = n-1;

    //     int index = -1;

    //     while(s<=e){
    //         int mid = (s+e)/2;
    //         if(a[mid] == t){
    //             index = mid;
    //             count++;
    //             break;
    //         } else if(a[mid]>t) e = mid-1;
    //         else s = mid+1;
    //     }

    //     for(int i = index-1; i>=0; i--){
    //         if(a[i] == t) count++;
    //         else break;
    //     }

    //     for(int i = index+1; i<n; i++){
    //         if(a[i] == t) count++;
    //         else break;
    //     }

    //     return count;
// }

    // ------- optimised solution: in log N------- 
    static int frequency(int[] a, int t){
        int n = a.length;
        int count = 0;

        int s = 0;
        int e = n-1;

        int leftIndex = -1;

        while(s<=e){
            int mid = (s+e)/2;
            if(a[mid] == t){
                leftIndex = mid;
                e = mid-1;
            } else if(a[mid]>t) e = mid-1;
            else s = mid+1;
        }

        s = 0;
        e = n-1;

        int rightIndex = -1;

        while(s<=e){
            int mid = (s+e)/2;
            if(a[mid] == t){
                rightIndex = mid;
                s = mid+1;
            } else if(a[mid]>t) e = mid-1;
            else s = mid+1;
        }

        if(leftIndex == -1) return -1;
        return rightIndex-leftIndex+1;
    }
}
