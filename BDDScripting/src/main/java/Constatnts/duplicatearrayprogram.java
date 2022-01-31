package Constatnts;

import java.util.*;

public class duplicatearrayprogram {

	public static void main(String[] args) {
		
		String [] Str = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"
				, "Servlets", "Java", "Struts", "JSP"};
		
		ArrayList<String> AL = new ArrayList<String>();
		
		for(int i=0;i<Str.length-1;i++) {
			
			for (int j=i+1;j<Str.length;j++) {
				
				if(Str[i].equals(Str[j]) && (i!=j)) {
					
					AL.add(Str[j]);
					
					
				}
			}
		}
		System.out.println(AL);
	}

}
