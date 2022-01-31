package Handson;

import java.util.*;

public class arraycomparision {

	public static void main(String[] args) {

			String[] A1 = {"car","bar","Mall","Tall","Ball"};
			String[] A2 = {"car","ramp","bar","Stamp","Mall"};
			
			ArrayList<String> AL = new ArrayList<String>();
			
			for(int i=0;i<A2.length;i++) {
				
				if(!Arrays.asList(A1).contains(A2[i])) {
					
					AL.add(A2[i]);
				}
				
			}

			System.out.println(AL);
	}

}
