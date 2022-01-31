package Constatnts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
	
		Actions Act = new Actions(d);
		
		WebElement element = null;
		
		WebElement element2 = null;
		
		Act.moveToElement(element).perform();
		
		Act.dragAndDrop(element, element2).perform();
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