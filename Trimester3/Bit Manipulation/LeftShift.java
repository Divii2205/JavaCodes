// Check if the ith bit is set(1) or unset(0)
import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();

        System.out.println(set(n, i));
    }

    static boolean set(int n, int i){
        // using right shift 
        // return ((n>>i)&1) != 0;

        // using left shift
        // int x = 1<<i; /*such numbers are known as bit masks*/
        return ((1<<i)&n) != 0;
    }
}
