package Constatnts;

import java.util.*;

public class comparearray {

	public static void main(String[] args) {
		
		String[] list = {"my_purchases", "account_menu", "auth", "base"};
        String[] checked = {"404", "account_menu", "auth", "base", "dashboard_base", "dashboard_menu", "fiveohthree", "footer", "header", "header_menu", "listings_menu"};

		
		ArrayList<String> ar = new ArrayList<String>();

		for(int i = 0; i < checked.length; i++) {
		      if(!Arrays.asList(list).contains(checked[i]))
		      ar.add(checked[i]);
		}
		
		System.out.println(ar);

	}

}
