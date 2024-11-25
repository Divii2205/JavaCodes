import java.util.*;

public class TwoEqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int[] arr1 = new int[num1];

        int num2 = sc.nextInt();
        int[] arr2 = new int[num2];

        boolean same = true;

        if (num1 == num2){
            for (int i =0; i<num1; i++){
                arr1[i] = sc.nextInt();
                arr2[i] = sc.nextInt();
            }

            for (int i = 0; i < num1; i++){
                if (arr1[i] != arr2[i]){
                    same = false;
                    break;
                }
            }
        } else same = false;

        if (same == true) System.out.println("true");
        else System.out.println("false");


        sc.close();
    }
}
