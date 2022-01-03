package Handson;

import java.util.*;

public class occuranceofspecialcharacter {

	public static void main(String[] args) {
		
		String S="twe@$@$$@$@$*&@*(&%$@(*&%(*&%(*@%$(@%$*(uhfgjkrhg456763585768&^)&%^)*&%&%";

		HashMap <Character,Integer> HM = new HashMap<Character,Integer>();
		
		for(int i=0;i<S.length();i++) {
			
			if(!(S.charAt(i) >= 65 && S.charAt(i) <= 90) ||
					!(S.charAt(i) >= 97 && S.charAt(i) <= 122)) {
				
				if(HM.containsKey(S.charAt(i))) {
					
					HM.put(S.charAt(i), HM.get(S.charAt(i))+1);
					
				}
				
				else {
					
					HM.put(S.charAt(i), 1);
					
				}
				
			}
			
		}
		
		System.out.println(HM);
	}

}
