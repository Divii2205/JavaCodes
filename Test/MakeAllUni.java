import java.util.*;

public class MakeAllUni {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        
        int[] arr = new int[N];

        for (int i = 0; i<N; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int count = 0;
        for (int i = 0; i<N-1; i++){
            for (int j = i+1; j<N; j++){
                if (arr[i] == arr[j]) {
                    arr[j]++;
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
