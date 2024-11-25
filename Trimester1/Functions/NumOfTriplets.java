import java.util.Scanner;

public class NumOfTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i <num; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i<num; i++){
            int sum = arr[i];
            for (int j = i+1; j<num; j++){
                sum += arr[j];
                for (int k = j+1; k<num; k++){
                    // int sum = arr[i] + arr [j] + arr[k];
                    sum += arr[k];
                    if (sum%2 == 0) count++;
                }
            }
        }

        System.out.println(count);
        sc.close();


        // reduce the number of iterations to N from Nsquare

        // copilot?
    }
}
