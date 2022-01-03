package Constatnts;

import java.util.*;

public class Arraylist {

	public static void main(String[] args) {
		
		int Array[]= {1,2,3,4,5,6,7,8,9};
		
		ArrayList <Integer> AL = new ArrayList<Integer>();
		
		for (int i=0;i<Array.length;i++) {
			
			if(Array[i]%2!=0) {
				
				AL.add(Array[i]);
				
			}
			
			
		}
			System.out.println(AL);
	}

}
