package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		String URL=driver.getCurrentUrl();			
		System.out.println(URL);				//https://www.facebook.com/
		String Title=driver.getTitle();
		System.out.println(Title);				//Facebook � log in or sign up
		WebElement text_login=driver.findElement(By.xpath("//input[@id='email']"));
		text_login.sendKeys("bharat@124");
		WebElement text_pass=driver.findElement(By.xpath("//input[@id='pass']"));
		text_pass.sendKeys("Pass@132");
		WebElement button_login=driver.findElement(By.xpath("//button[@name='login']"));
		button_login.click();
		
		driver.navigate().to("https://www.instagram.com/accounts/emailsignup/?hl=en");
		
		Thread.sleep(2000);
		String Insta_URL=driver.getCurrentUrl();
		System.out.println(Insta_URL);
		String Insta_title=driver.getTitle();
		System.out.println(Insta_title);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
	}

}
