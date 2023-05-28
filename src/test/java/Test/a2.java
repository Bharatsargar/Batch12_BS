package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a2 {

	public static void main(String[] args)
	throws Exception
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
						
		Thread.sleep(5000);
		driver.navigate().to("https://www.instagram.com/");
		driver.navigate().refresh();
		String title2=driver.getTitle();
		System.out.println(title2);
		String url2=driver.getCurrentUrl();
		System.out.println(url2);
		
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().back();
		driver.close();

		
	}

}
