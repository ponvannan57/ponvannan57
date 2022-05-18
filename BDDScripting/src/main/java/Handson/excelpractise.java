package Handson;

import java.io.*;
import java.util.*;

import org.openqa.selenium.support.ui.Select;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.awaitility.reflect.exception.FieldNotFoundException;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class excelpractise {
	
	public static void screenshot() throws IOException {
		
		WebDriver d = new ChromeDriver();
		WebElement Element = d.findElement(By.xpath(""));
		WebElement Element1 = d.findElement(By.xpath(""));
		File Src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Src, new File("naME"));
		
		
	}


	public static void main(String[] args) {
		
		String S ="Ponvannan";

		HashMap<Character,Integer> HM = new HashMap<Character,Integer>();

		for(int i=0;i<S.length();i++){

			
				
				if(HM.containsKey(S.charAt(i))) {
					
					HM.put(S.charAt(i), HM.get(S.charAt(i))+1);
				}
				
				else
					HM.put(S.charAt(i), 1);
				}
			
				
		
		
		System.out.println(HM);
//		
//		int N =59;
//		
//		int F=0;
//		
//		for(int i =2;i<=Math.sqrt(N);i++) {
//			if (N%i==0){
//				F=1;
//
//			}
//			
//		}
//		
//		if(F==1) {
//		System.out.println("Not");	
//		}
//		
//		if(F==0) {
//			System.out.println("Yes");	
//				}
		
		
		
//		String s="Ponvannan";
//		int n=s.length();
//		int i=n-1;
//		String r="";
//		while(i>=0)
//		{
//			r+=s.charAt(i);
//			i--;
//		}
//		System.out.println(r);
//		
//		int[] A ={2,0,4,0,5,6,0,9,8};
//		int[] B = {2,4,5,6,9,8,0,0,0};
//
//		ArrayList<Integer> AL = new ArrayList<Integer>();
//		ArrayList<Integer> AL2 = new ArrayList<Integer>();
//
//		for(int i=0;i<A.length;i++){
//
//			if(!(A[i]==0)){
//			AL.add(A[i]);
//			
//			}
//			else{
//			AL2.add(A[i]);
//			}
//
//		}
//
//		int AL1 = AL.size();
//		int AL3 = AL2.size();int[] A ={2,0,4,0,5,6,0,9,8};
//		int[] B = {2,4,5,6,9,8,0,0,0};
//
//		ArrayList<Integer> AL = new ArrayList<Integer>();
//		ArrayList<Integer> AL2 = new ArrayList<Integer>();
//
//		for(int i=0;i<A.length;i++){
//
//			if(!A[i]==0){
//			AL.add(A[i]);
//			
//			}
//			else{
//			AL2.add(A[i]);
//			}
//
//		}
//
//		int AL1 = AL.length;
//		int AL3 = AL2.length;
//
//		int[] B = new int[AL1+AL3];
//
//		for(){
//
//		}
//		
//		AL.addAll(AL2);
//		
//		System.out.println(AL);

		
		
		
		
		
//
//		WebDriver d = new ChromeDriver();
//		
//		Actions act = new Actions(d);
//		
//		WebElement Element = d.findElement(By.xpath(""));
//		WebElement Element1 = d.findElement(By.xpath(""));
//		
//		act.moveToElement(Element).perform();
//		
//		WebElement entriesDropDownLocator = d.findElement(By.xpath("//select[@name='example_length']"));
//		
//		Select Select = new Select(entriesDropDownLocator);
//		  
//	List <WebElement> L = Select.getOptions();
//	
//	Select optionSelect = new Select(d.findElement(By.id("dropdown_cities")));
//
//	List <WebElement> elementCount = optionSelect.getOptions();
//	
//	for(int i=0;i<L.size();i++) {
//		
//		if(L.get(i).getText().equals(L.get(i).getText())) {
//			
//			System.out.println("The element in List L "+L.get(i).getText()+" ");
//			
//		}
//	
//	}
	}
}
		


