package Constatnts;

import java.util.Scanner;

public class Constants {
	
	public static void main (String args[]) {		
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();
		String Str="";
		char ch;
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			Str = ch+Str;		
		}
		System.out.println(Str);
	}
	
}