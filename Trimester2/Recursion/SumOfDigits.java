import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(count(n));
    }

    // Time complexity: log(N) base 10 => Number of digits of the given number
    // Space complexity: log(N) base 10
    // NOTE: larger base will take lesser time (considering log function)

    static int count(int n){
        if(n<0) return count(n*-1);
        if(n == 0) return 0;
        return n%10 + count(n/10);
    }
}
