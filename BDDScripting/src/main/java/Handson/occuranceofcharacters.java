package Handson;

import java.util.HashMap;
import java.util.*;

public class occuranceofcharacters {
	


	public static void main(String[] args) {
		
		HashMap<Character,Integer> HM = new HashMap<Character,Integer>();
		
		String S ="aaSSSDDFFFGNGNGRYJRJYJYJYYYJKMHJT";
		
		for(int i=0;i<S.length();i++) {
			
			if(HM.containsKey(S.charAt(i))) {
				
				HM.put( S.charAt(i),HM.get(S.charAt(i))+1);
				
			}
			
			else{
				
				HM.put(S.charAt(i),1);
				
			}
			
		}
		System.out.println(HM);
	}

}
