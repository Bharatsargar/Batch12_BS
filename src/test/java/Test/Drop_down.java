package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_down {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']//option"));
		drp_country.click();
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.xpath("//select[@name='country']//option"));
		Thread.sleep(2000);
		System.out.println(list.size());
		for(int i=0;i<=list.size();i++) {
			if(list.get(i).getText().equals("INDIA")) {
				list.get(i).click();
			}
		}
		
		
	}

}
