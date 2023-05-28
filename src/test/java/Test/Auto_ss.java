package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_ss {
	public static void main(String []args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.xpath("//input[@title='Search']"));
		search.click();
		
	List<WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']"));
		int list_Auto=list.size();
		System.out.println(list_Auto);
		
		
		
		
		
	}

}
