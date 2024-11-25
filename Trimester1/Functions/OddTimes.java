import java.util.Scanner;

public class OddTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i <num; i++){
            arr[i] = sc.nextInt();
        }
        
        for (int i =0; i<num; i++){
            int count = 0;
            for (int j = 0; j< num; j++){
                if (arr[i] == arr[j]) count++;
            }

            if (count%2 !=0) {
                System.out.println(arr[i]);
                break;
            }
        }

        sc.close();
    }
}
