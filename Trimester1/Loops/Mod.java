import java.util.*;

public class Mod {
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();
		//int K = sc.nextInt();
		
		//---- print true if for a particular number 'a' there exists a remainder K  when divided by N else false
		//if (K<0 || K>=N){
		//	System.out.println ("False");
		//} else {
		//	System.out.println ("True");
		//}
		
		//---- largest number less than or equal to N that is divisible by K
		//int mod = N%K;
		//System.out.println (N-mod);
		
		//---- given a number N, print the 10's place digit
		int mod = N%100;
		int	K = mod/10;
		
		if (N<0){
			System.out.println (K*(-1));
		} else {
			System.out.println (K);
		}
		sc.close();
		
	}    
}
