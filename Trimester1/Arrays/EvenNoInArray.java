import java.util.*;

public class EvenNoInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        int evenCount = 0;
        for (int i = 0; i <N; i++){
            int num = sc.nextInt();
            arr[i] = num;        
        }

        for (int i = 0; i <N; i++){
            if (arr[i]%2 == 0) evenCount++;
        }
        
        System.out.println(evenCount);
        sc.close();
    }
}
