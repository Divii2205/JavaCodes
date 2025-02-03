import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int i = 0;
        int j = s.length()-1;

        System.out.println(check(s, i, j));   
    }

    static boolean check(String s, int i, int j){
        if(i>=j) return true;
        if(s.charAt(i) != s.charAt(j)) return false;
        return check(s, i+1, j-1);
    }
}
