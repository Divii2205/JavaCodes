import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = Math.abs(sc.nextInt()), num2 = Math.abs(sc.nextInt());

        if (num1 == 0 || num2 == 0){
            if (num1 == 0){
                System.out.println(num2);
            } else {
                System.out.println(num1);
            }
        } else if (num1>=num2){
            for (int i = num2; i>0; i--){
                if (num1%i == 0 && num2%i == 0){
                    System.out.println(i);
                    break;
                }
            }
        } else if (num2>num1){
            for (int i = num1; i>0; i--){
                if (num1%i == 0 && num2%i == 0){
                    System.out.println(i);
                    break;
                }
            }
        }
        sc.close();
    }  
}

// this code can be optimised using the 'log' function

