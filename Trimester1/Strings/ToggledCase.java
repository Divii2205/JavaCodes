
import java.util.Scanner;

public class ToggledCase {

    static String toggleString(String str){
        // String newStr = "";

        // Use StringBuilder
        StringBuilder newStr = new StringBuilder();

        int val = Math.abs('a' - 'A');

        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            // if (ch >= 'a' && ch <= 'z') newStr += (char)(ch - val);
            // else if (ch >= 'A' && ch <= 'Z') newStr += (char)(ch + val);


            if (ch >= 'a' && ch <= 'z') newStr.append((char)(ch - val));
            else if (ch >= 'A' && ch <= 'Z') newStr.append((char)(ch + val));
        }
        // return newStr;
        return newStr.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(toggleString(str));
    }
}
