import java.util.*;

public class MultiMaxOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i <num; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        // works for distinct array items only
        System.out.println("Maximum element: " + arr[num-1]);
        System.out.println("Second maximum element: " + arr[num-2]);
        System.out.println("Third maximum element: " + arr[num-3]);

        sc.close();
    }
}
