package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class atri_01 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);
		driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		Thread.sleep(5000);
		String title=driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
			
		
	}

}
