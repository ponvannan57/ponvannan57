package Constatnts;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {

	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("document.getElementById('user_email_login').value='rbc@xyz.com';");
		js.executeScript("document.getElementById('user_password').value='password';");
		js.executeScript("document.getElementById('user_submit').click();");
		
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String Filename = "\\C\\reports\\Screenshots\\";
		File Src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(Src, new File(Filename));
		
		
		WebDriverWait wait = new WebDriverWait(d,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
		
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		
//		git config –global user.name “[name]”  
//		git init [repository name]
//		git clone [url]  
//		git add [file]  
//		git add *
//		git commit -m “[ Type in the commit message]”  
//		git checkout [branch name] 
//		git merge [branch name]  
//		git pull [Repository Link]
//		git push [variable name] master  
		
		
	
		
		WebElement element = null;
		
		WebElement element2 = null;
		
		Actions Act = new Actions(d);
		
		Act.moveToElement(element).perform();
		
		Act.dragAndDrop(element, element2).perform();
		
		List <WebElement> Element = d.findElements((By) element2);
		
		ArrayList<String> Al = new ArrayList<String>();
		
		Select S = new Select(element2);
		
		List <WebElement> L = S.getOptions();
		
		HashMap<String,String> HM = new HashMap<String,String>();
		
		for(int i =0;i<Element.size();i++) {
			
			HM.put(Element.get(i).getAttribute("Name"), Element.get(i).getText());
			
		}
		
		String Parent = d.getWindowHandle();
		Set <String> Set = d.getWindowHandles();
		
		Iterator <String> I = Set.iterator();
		
		while(I.hasNext()) {
			
			String Child = I.next();
			if(!Parent.equals(Child)) {
				d.switchTo().window(Child);
			}
		}
		
		
		
		
		
		}
	
		public static String fileread(String filename, String sheetname,int cellindex, int rowindex) throws IOException {
			File path = new File(filename);
			FileInputStream FIS = new FileInputStream(path);
			XSSFWorkbook Wb = new XSSFWorkbook(FIS);
			XSSFSheet Sheet = Wb.getSheet(sheetname);
			String DATA;
			try {
				DATA = Sheet.getRow(rowindex).getCell(cellindex).getStringCellValue();	
			}
			catch(NullPointerException e){
				DATA=" ";
			}
			Wb.close();
			return DATA;	
		}
		
		

		public static void filewrite(String filename, String sheetname,int cellindex, int rowindex, String DATA) throws IOException {
			File path = new File(filename);
			FileInputStream FIS = new FileInputStream(path);
			XSSFWorkbook WB = new XSSFWorkbook(FIS);
			XSSFSheet Sheet = WB.getSheet(sheetname);
			if(Sheet.getRow(rowindex)==null) {	
				Sheet.createRow(rowindex).createCell(cellindex).setCellValue(DATA);	
			}
			else {
				Sheet.getRow(rowindex).getCell(cellindex).setCellValue(DATA);
			}
			FileOutputStream FOS = new FileOutputStream(path);
			WB.write(FOS);
			WB.close();
		}
	}