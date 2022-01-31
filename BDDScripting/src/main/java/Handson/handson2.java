package Handson;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.*;
import java.io.*;

public class handson2 {
	
	static boolean parenthesis (String S) {
		
		Deque<Character> DQ = new ArrayDeque<Character>();
		
		for(int i=0;i<S.length();i++) {
			
			if(S.charAt(i)=='{' || S.charAt(i)=='(' || S.charAt(i)=='[') {
				
				DQ.push(S.charAt(i));
				continue;
				
			}
			
			if(DQ.isEmpty()) {
				return false;
			}
			
			char c;
			
			switch(S.charAt(i)) {
			
			case'}':
				c=DQ.pop();
				if(c=='(' || c=='[') {
					return false;
				}
				break;
			case')':
				c=DQ.pop();
				if(c=='{' || c=='[') {
					return false;
				}
				break;
			case']':
				c=DQ.pop();
				if(c=='(' || c=='{') {
					return false;
				}
				break;
			
			}
			
		}	
	
		return true;
		
	}
	

	public static void main(String[] args) {
		
		String S ="{}[({)]{";
		
		if(parenthesis(S)) {
			
			System.out.println("Balanced");
			
		}
		
		else {
			System.out.println("Not Balanced");
		}
	}
}

