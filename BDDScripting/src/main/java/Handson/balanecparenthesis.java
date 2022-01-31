package Handson;
import java.util.*;

public class balanecparenthesis {
	
	static boolean parentheseis(String S) {
		
		Deque<Character> Stack = new ArrayDeque<Character>();
		
		for(int i=0;i<S.length();i++) {
			
			if(S.charAt(i)=='(' || S.charAt(i)=='[' || S.charAt(i)=='{') {
				
				Stack.push(S.charAt(i));
				continue;
				
			}
			
			if (Stack.isEmpty()) {
				System.out.println("-1");
                return false;
			}
			char C;
			switch(S.charAt(i)){
			
			case')':
				C=Stack.pop();
				if(C=='{' || C=='[') {
					System.out.println("-1");
					return false;
				}
				break;
			case']':
				C=Stack.pop();
				if(C=='(' || C=='{') {
					System.out.println("-1");
					return false;
				}
				break;
			case'}':
				C=Stack.pop();
				if(C=='(' || C=='[') {
					System.out.println("-1");
					return false;
				}
				break;
				
			}
			
		}System.out.println("1");
		return true;
		
	}

	public static void main(String[] args) {
		
		String S = "{{][}}";
	//	parentheseis(S);
		 if (parentheseis(S))
	            System.out.println("Balanced ");
	        else
	            System.out.println("Not Balanced ");
	    }

}
