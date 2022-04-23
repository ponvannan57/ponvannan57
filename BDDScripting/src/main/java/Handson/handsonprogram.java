package Handson;

import java.util.*;

public class handsonprogram {

	public static void main(String[] args) {
		String S="01000100010110";
		int Count=0;
		
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)=='1') {
				
				if(S.charAt(i-1)=='0' && S.charAt(i+1)=='0') {
				Count++;	
				}
				
			}
			
		}
		System.out.println(Count);
	}
}
