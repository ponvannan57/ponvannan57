package Constatnts;

import java.util.*;

public class overloading {
	
	
	public static void main(String[] args) {
	
	
	String Text ="jhfgjdfhabjbeeeeeiifhfooouu";
	
	HashMap <Character,Integer> HM = new HashMap<Character,Integer>();

	 for(int i=0;i<Text.length();i++){
		 
		 if(Text.charAt(i)=='a' || Text.charAt(i)=='e' || Text.charAt(i)=='i' ||
				 Text.charAt(i)=='o' || Text.charAt(i)=='u') {
			 
			 if(HM.containsKey(Text.charAt(i))) {
				 
				 HM.put(Text.charAt(i), HM.get(Text.charAt(i))+1);
				 
			 }
			 
			 else {
				 
				 HM.put(Text.charAt(i),1);
			 }
			 
			 
		 }
		 
	 }
	
	 System.out.println(HM);
	}
}
