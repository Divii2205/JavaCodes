import java.util.*;
public class ModifyArray_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i =0; i<num; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < num/2; i++){
            int temp = arr[i];
            arr[i] = arr [num-i-1];
            arr[num-i-1] = temp;
        }

        for (int i = 0; i <num; i++) System.out.print(arr[i] + " ");
        System.out.println();
        sc.close();
    }   
}
