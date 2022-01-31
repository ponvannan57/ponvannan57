package Handson;

public class stringpalindrome {
	
	public static void main(String[] args) {
		
		String S = "TOddOT";
		int Q=0,T=S.length()-1;
		while(Q<T) {
			
			if(S.charAt(Q)!=S.charAt(T)) {
				
				System.out.println("Not a Palindrome");
				
				return;
				
				
			}
			
			Q++;
			T--;
			
		}
		
		System.out.println("Palindrome");
		
	}
	}


