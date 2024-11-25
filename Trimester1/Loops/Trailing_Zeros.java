import java.util.*;

public class Trailing_Zeros {
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;

        // for (int i = 5; i<=N; i+=5){
        //     if (i%5 == 0){
        //         count ++;
        //         int j = i;
        //         while ((j/5)%5 == 0 && j != 0){
        //             count ++;
        //             j = j/5;
        //         }
        //     }
        // }

        int i = 5;
        while (i <=N){
            count += (N/i);
            i *= 5;
        }

        System.out.println(count);
        sc.close();
    }
}
