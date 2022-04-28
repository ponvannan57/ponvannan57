package Handson;

import java.io.*;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.awaitility.reflect.exception.FieldNotFoundException;

public class excelpractise {
	


	public static void main(String[] args) {

		String S = "Ponvannan";
		String S1 ="";
		char c;
		
		int L =S.length()-1;
		
		while(L>=0) { 
		
			c=S.charAt(L);
			S1+=c;
			L--;
			}
	
	
		
		System.out.println(S1);
	}
}
		


