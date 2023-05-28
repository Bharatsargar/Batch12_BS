

package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Movement {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
	//	driver.get("https://www.google.com/");
		driver.get("https://demo.guru99.com/insurance/v1/index.php");
		WebElement drp_selenium=driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
	//	WebElement gmail=driver.findElement(By.xpath("//a[@class='gb_d']"));
		Actions act=new Actions(driver);
	//	act.moveToElement(gmail).click().build().perform();
		act.moveToElement(drp_selenium).click().build().perform();
		act.contextClick(drp_selenium).build().perform();				//Right Click
	//	act.doubleClick(drp_selenium).build().perform();				// Double click
		
		
		
	}

}
