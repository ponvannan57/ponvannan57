package Handson;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.*;
import java.io.*;

public class handson2 {
	

	public static void main(String[] args) {
		String[] list = {"my_purchases", "account_menu", "auth", "base"};
        String[] checked = {"404", "account_menu", "auth", "base", "dashboard_base", "dashboard_menu", "fiveohthree", "footer", "header", "header_menu", "listings_menu"};
        
        ArrayList <String> AL = new ArrayList<String>();
        
        for(int i=0;i<checked.length;i++) {
        	if(!Arrays.asList(list).contains(checked[i])) {
        		AL.add(checked[i]);
        		
        		
        	}
        	
        }
        
        
        System.out.println(AL);
        
        
	}
}

