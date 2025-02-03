import java.util.Scanner;

public class APowerN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(count(a, n));
    }

    // Time complexity: O(N)
    // Space complexity: O(N)

    // static int count(int a, int n){
    //     if(n==0) return 1;
    //     return a*count(a, n-1);
    // }

    // ----------

    // Time complexity: O(N)
    // Space complexity: O(N)

    // static int count(int a, int n){
    //     if(n==0) return 1;
    //     if(n%2==0) return count(a, n/2)*count(a, n/2);
    //     return a*count(a, n/2)*count(a, n/2);
    // }

    // ----------
    
    // Time complexity: O(log N)
    // Space complexity: O(log N)

    static int count(int a, int n){
        if(n==0) return 1;
        int halfPower = count(a, n/2);
        if(n%2==0) return halfPower*halfPower;
        return a*halfPower*halfPower;
    }
}
