package Handson;

import java.util.*;

public class palindromehandson {

	public static void main(String[] args) {

		Scanner Scan =new Scanner (System.in);
		int I = Scan.nextInt();
		
		int a,b,c=0;
		
		a = I;
		
		while(I>0) {
			
			b=I%10;
			System.out.println(b);	
			c = (c*10)+b;
			System.out.println(c);	
			I=I/10;
			System.out.println(I);	
			
		}
		
		if (a==c) {		
			System.out.println("The Number Is Palindrome");			
		}	
		else {			
			System.out.println("The Number Not Is Palindrome");			
		}
		

	}

}
