
package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_drop {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement bank=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement account=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement rs500=driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement ammount_bx=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		
		Actions act=new Actions(driver);
		act.dragAndDrop(bank, account).build().perform();
		act.dragAndDrop(rs500, ammount_bx).build().perform();
		
	
		
		
		
		
		
		
		
	}

}
