import java.util.Scanner;

public class CrazySwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        n = n^m;
        m = n^m;
        n = n^m;

        System.out.println(n + " " + m);
    }   
}
