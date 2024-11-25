package Test;
public class Strings {
    public static void main(String[] args) {
        
        String y = "123456789" ;
        int num = 0;
        for (int i = 0; i <y.length(); i++){
            num = num*10 + y.charAt(i)-'0';
        }
        
        System.out.println(num);
    }
}
