package Handson;

import java.util.HashMap;

public class vowelshandson {

	public static void main(String[] args) {
		
		String S = "hvsdhasvdajvbj,be,b,b,beeeeeej,bjbiiiiii,jb,jooooo,jbududugbhijba";
		HashMap<Character,Integer> HM = new HashMap<Character,Integer>();
		for (int i=0;i<S.length();i++) {
			if(S.charAt(i)=='a' || S.charAt(i)=='e' ||S.charAt(i)=='i' ||
					S.charAt(i)=='o' ||S.charAt(i)=='u') {
				
				if(HM.containsKey(S.charAt(i))) {
					HM.put(S.charAt(i), HM.get(S.charAt(i))+1);	
					
				}
				
				else
				{
					
					HM.put(S.charAt(i), 1);
					
				}	
			}
		}
		System.out.println(HM);
	}
}
