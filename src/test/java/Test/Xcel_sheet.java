package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xcel_sheet {

	public static void main(String[] args) throws Exception {
		String path="C:\\Users\\Param\\eclipse-workspace\\Bharat_BS_07\\TestData\\Data.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String value1=wb.getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value1);
		
		String value2=wb.getSheet("Sheet2").getRow(0).getCell(1).getStringCellValue();
		System.out.println(value2);
		
		// sending data to the WebElement
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement gmail=driver.findElement(By.xpath("//input[@name='email']"));
		gmail.sendKeys(value2);
		
		
		
		
		
		
	}

}
