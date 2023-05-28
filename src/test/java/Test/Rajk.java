package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rajk {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(null);
		Thread.sleep(5000);
		
		WebElement Login_id =driver.findElement(By.xpath(" "));
		
		Login_id.sendKeys("");
		
		Thread.sleep(5000);
		
		WebElement passward=driver.findElement(By.xpath(""));
		passward.sendKeys("");
		
		Thread.sleep(5000);
		
		WebElement Login_btn =driver.findElement(By.xpath(""));
		Login_btn.click();
		
		
		
		
	}

}
