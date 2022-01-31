package Handson;

import java.util.*;
import java.util.List;

import org.apache.commons.collections.list.TreeList;

public class arraymerge {
	
	public static void main(String[] args) {
		
		int[] a1 = {2,2,2,2,43,69,45,11};
		int[] a2 = {21,43,46,77,88,95,160,121};
		
		int A=a1.length;
		int B=a2.length;
		
		int C=A+B;
		
		int[] a3 = new int[C];
		
		for(int i=0;i<A;i++) {
			
			a3[i]=a1[i];
			
		}
	
		for(int i=0;i<B;i++) {
					
			a3[A+i]=a2[i];
					
		}
		
		Arrays.sort(a3);
		
		System.out.println(Arrays.toString(a3));
//		
//		TreeList TL = new TreeList();
//		
//		TL.add(Arrays.toString(a3));
//		
//		System.out.println(TL);
		
		TreeSet<Integer>TS = new TreeSet<Integer>();
		
		for(Integer Num : a3){
			
			TS.add(Num);
			
		}
		
		System.out.println(TS);
	}

}
