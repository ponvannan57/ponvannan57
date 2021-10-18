package Mainclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.yaml.snakeyaml.Yaml;

public class Main {
	
	public static WebDriver d;
	public Actions Act;
	public static Map<?,?> property;
	public static String Parentfolder = "ObjectRepository/";
	public static String Filepath;
	public String nameofCurrClass = new Throwable().getStackTrace()[0] .getClassName();
    
	
	
	@Test
	public void Browserselection (String Browser, String URL) {
		
		switch(Browser) {
		
		case"Chrome":
//			DesiredCapabilities capabilities= DesiredCapabilities.chrome();
//			ChromeOptions options=new ChromeOptions();
//			options.addArguments("incognito");
//			options.addArguments("--disable-notifications");
//			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			System.setProperty("webdriver.chrome.driver", "src\\test\\Browsers\\chromedriver.exe");
		    System.out.println("The Browser Selected is Chrome");
			d= new ChromeDriver();
			break;
		case"IE":
			System.setProperty("webdriver.ie.driver", "src\\test\\Browsers\\IEDriverServer.exe");
			d= new InternetExplorerDriver();
			break;
		case"Firefox":
			System.setProperty("webdriver.gecko.driver", "src\\test\\Browsers\\geckodriver.exe");
			d= new FirefoxDriver();
			break;
		
		}
		d.manage().window().maximize();
		String URLYML = "URL.".concat(URL);
		d.get(getElementProperty(URLYML));
		Takescreenshot(nameofCurrClass);
		
	}
	
	@Test
	public static void initializeObjectProperty(String Filename)
	 {
		Filepath = Parentfolder.concat(Filename);
		System.out.println(Filepath);
	  try {
	   Reader rd = new FileReader(Filepath);
	   Yaml yaml = new Yaml();
	   property = (Map<?,?>) yaml.load(rd);
	   System.out.println(property);
	   rd.close();
	  } catch (FileNotFoundException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  } catch (IOException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	  }
	 }
	
	@Test
	public static String getElementProperty(String objectstring)
	 {  
	Map <?,?> map = (Map<?,?>) property.get(objectstring.split("\\.")[0]); 
	  return map.get(objectstring.split("\\.")[1]).toString();

	 }
	
	@Test
	public static void Takescreenshot(String nameofCurrClass) {
		
		Date date = new Date();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd_MM_yyyy");  
		LocalDateTime now = LocalDateTime.now();
		String Mainfolder = "Run_"+dtf.format(now);
		String Name = date.toString().replace(":", "_").replace(" ", "_")+".jpg";
		String Filename = "\\C\\reports\\Screenshots\\"+Mainfolder+"\\"+nameofCurrClass+"\\"+Name;
		
		try {
		
		File Src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Src, new File(Filename));
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
		
	}
	
	
	public static String fileread(String filename, String sheetname,int cellindex, int rowindex) throws IOException {
		
		File path = new File(filename);
		FileInputStream FIS = new FileInputStream(path);
		XSSFWorkbook Wb = new XSSFWorkbook(FIS);
		XSSFSheet Sheet = Wb.getSheet(sheetname);
		String DATA;
		
		try {
			
			DATA = Sheet.getRow(rowindex).getCell(rowindex).getStringCellValue();
			
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
			
			Sheet.createRow(rowindex).createCell(rowindex).setCellValue(DATA);
			
		}
		
		else {
			Sheet.getRow(rowindex).getCell(rowindex).setCellValue(DATA);
		}
		
		FileOutputStream FOS = new FileOutputStream(path);
		WB.write(FOS);
		WB.close();
		
	}
	
	public static void terminate() {
		d.quit();
		
	}

}
