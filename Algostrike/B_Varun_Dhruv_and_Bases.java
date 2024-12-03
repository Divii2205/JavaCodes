import java.util.Scanner;

public class B_Varun_Dhruv_and_Bases {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int T = sc.nextInt();

        while(T-->0){
            String N1 = sc.next();
            int B1 = sc.nextInt();
            String N2 = sc.next();
            int B2 = sc.nextInt();
            int B3 = sc.nextInt();
            String op = sc.next();

            long newN1 = Long.parseLong(N1, B1);
            long newN2 = Long.parseLong(N2, B2);

            long cal = 0;

            if (op.equals("+")) {
                cal = newN1 + newN2;
            } else if (op.equals("-")) {
                cal = newN1 - newN2;
            } else if (op.equals("*")) {
                cal = newN1 * newN2;
            } else if (op.equals("/")) {
                cal = newN1 / newN2;
            }

            String ans = "";

            if (cal == 0) System.out.println(0);
            else {
                while (cal>0){
                    long mod = cal%B3;
                    ans = mod + ans;
                    cal/=B3;
                }
                System.out.println(ans);
            }
        }
    }
}