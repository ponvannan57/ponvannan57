package Constatnts;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner Scan = new Scanner (System.in);
		int I = Scan.nextInt();
		int a,b,c=0;
		a=I;
		while(I>0) {
			b = I%10;
			c = (c*10)+b;			
			I=I/10;			
		}		
		if (a==c) {		
			System.out.println("The Number Is Palindrome");			
		}	
		else {			
			System.out.println("The Number Not Is Palindrome");			
		}
	}
}


