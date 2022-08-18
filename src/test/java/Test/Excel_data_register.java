package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel_data_register {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		
		WebElement first_name=driver.findElement(By.xpath("//input[@name='firstName']"));
		WebElement last_name=driver.findElement(By.xpath("//input[@name='lastName']"));
		WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));
		WebElement user_email=driver.findElement(By.xpath("//input[@name='userName']"));
		WebElement address1=driver.findElement(By.xpath("//input[@name='address1']"));
		WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
		WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
		WebElement postalcode=driver.findElement(By.xpath("//input[@name='postalCode']"));
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement conf_pass=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		//Sendkeys
		
		String path="C:\\Users\\Param\\eclipse-workspace\\Bharat_BS_07\\TestData\\Book1.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String name1=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(name1);
		first_name.sendKeys(name1);
		String lastname1=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(lastname1);
		last_name.sendKeys(lastname1);
		//Thread.sleep(2000);
		String phone1=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(phone1);
		phone.sendKeys(phone1);
		String use_name=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(use_name);
		user_email.sendKeys(use_name);
		//Thread.sleep(2000);
		String add1=wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		System.out.println(add1);
		address1.sendKeys(add1);
		String city1=wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		System.out.println(city1);
		city.sendKeys(city1);
		String state1=wb.getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
		state.sendKeys(state1);
		String pin=wb.getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
		postalcode.sendKeys(pin);
		Thread.sleep(2000);
		//Dropdown
		WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));
//		drp_country.click();
//		Thread.sleep(2000);
//		List<WebElement> list=driver.findElements(By.xpath("//select[@name='country']//option"));
//		Thread.sleep(2000);
//		System.out.println(list.size());
//		for(int i=0;i<=list.size();i++) {
//			if(list.get(i).getText().equals("INDIA")) {
//				list.get(i).click();
//			}
//		}	//second method of the drp_handle
		
		Select sel=new Select(drp_country);
		sel.selectByIndex(4);
		
		
		
		//dropdown selected
		//Thread.sleep(2000);
		String username1=wb.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		email.sendKeys(username1);
		String pass1=wb.getSheet("Sheet1").getRow(4).getCell(0).getStringCellValue();
		pass.sendKeys(pass1);
		conf_pass.sendKeys(pass1);
		Thread.sleep(2000);
		
		
		
		
	}

}
