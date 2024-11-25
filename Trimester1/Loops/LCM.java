import java.util.Scanner;

public class LCM{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int product = num1*num2;
        int gcd = 0;

        while (num2%num1 != 0){
            gcd = num2 % num1;
            num2 = num1;
            num1 = gcd;
        }

        System.out.println (product/num1);
        sc.close();
    }
}