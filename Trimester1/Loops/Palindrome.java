import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String num = sc.nextLine();
        int len = num.length();

        boolean out = false;

        for (int i = 0; i<len-1; i++){
            if (num.charAt(i) == num.charAt((len-1)-i)){
                out = true;
            } else {
                out = false;
                break;
            }
        }
        
        if (out == true){
            System.out.println ("Palindrome");
        } else {
            System.out.println ("Not Palindrome");
        }
        sc.close();
    }
}