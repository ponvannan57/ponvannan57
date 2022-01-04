package Handson;

import java.util.ArrayList;
import java.util.*;

public class practise {

	public static void main(String[] args) {
		
		int[] Str= {1,2,3,4,2,3,5};
		
		HashSet<Integer> HS = new HashSet<Integer>();
		
		
		for(int i=0;i<Str.length;i++) {
		
			HS.add(Str[i]);
			
			
		}
		System.out.println(HS);	
	}
}

