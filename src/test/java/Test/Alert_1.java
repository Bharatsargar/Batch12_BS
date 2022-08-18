package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_1 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/Agile_Project/Agi_V1/index.php");
		WebElement login=driver.findElement(By.xpath("//input[@name='uid']"));
		login.sendKeys("bharat122");
		Thread.sleep(2000);
		
		WebElement btn_login=driver.findElement(By.xpath("//input[@name='btnLogin']"));
		btn_login.click();
		
		// alert action
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		String text=alt.getText();
		System.out.println(text);
		alt.accept();
		
		
		
		
	}

}
