package Constatnts;

import java.util.*;

public class duplicatearrayprogram {

	public static void main(String[] args) {
		
		String [] Str = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"
				, "Servlets", "Java", "Struts", "JSP"};
		
		HashMap<String,Integer> HM = new HashMap<String,Integer>();
		
		for(int i=0;i<Str.length-1;i++) {
			
			for (int j=i+1;j<Str.length;j++) {
				
				if(Str[i].equals(Str[j]) && (i!=j)) {
					
					System.out.println("The Duplicate Element is : "+Str[j]);
					
					if(HM.containsKey(Str[i])) {
						
						HM.put(Str[i], HM.get(Str[i])+1);
						
					}
					
					else{
						HM.put(Str[i], 1);
					}
					
				}
				
			}
			
		}
		
		System.out.println(HM);

	}

}
