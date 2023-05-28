package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_suggesion {

	public static void main(String[] args) throws Exception {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement text=driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("aadhar");
		Thread.sleep(3000);
		
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));
		System.out.println(list.size());
		for(int i=0;i<=list.size()
				
				;i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("aadhar card password")){
				list.get(i).click();
				
				
			}
		}
	//	System.out.println(list.get(4).getText());
	//	list.get(4).click();
		
		


		
		
		
		
		
	}

}
