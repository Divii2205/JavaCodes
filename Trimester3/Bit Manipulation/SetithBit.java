// Set the ith bit of the given number

import java.util.Scanner;

public class SetithBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(set(n, i));
    }

    static int set (int n, int i){
        return (1<<i)|n; 
    }
}
