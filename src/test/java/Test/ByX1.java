package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByX1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("1234");
		//driver.findElement(By.xpath("//a[@id=\"u_0_0_eK\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"u_0_4_jT\"]"));
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@id=\"u_0_4_jT\"]"));

		driver.findElement(By.name("login")).click();
		
		
		
		
	}

}
