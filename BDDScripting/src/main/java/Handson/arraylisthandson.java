package Handson;

import java.util.ArrayList;

public class arraylisthandson {

	public static void main(String[] args) {
		
		int Array[]= {12,35,12,45,89,35,37,39};
		
		ArrayList<Integer> AL = new ArrayList<Integer>();
		
		for(int i=0;i<Array.length;i++) {
			
			if(Array[i]%2!=0) {
				
				AL.add(Array[i]);
				
			}
			
		}
		System.out.println(AL);
	}
}
