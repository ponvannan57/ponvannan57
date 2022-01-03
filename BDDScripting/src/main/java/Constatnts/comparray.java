package Constatnts;

import java.util.*;

public class comparray {

	public static void main(String[] args) {
		String Array1[] = {"Apple","Mango","Grapes","as","dv","dvdv","dbdf","fb","ff"};
		String Array2[] = {"db","db","db","cac","Apple","Mango","Grapes","as"};
		
		ArrayList <String> AL = new ArrayList<String>();
		
		for (int i=0;i<Array1.length;i++) {
			
			if(Arrays.asList(Array2).contains(Array1[i])) {
				
				AL.add(Array1[i]);
				
			}
			
		}
		
		System.out.println(AL);
	}

}
