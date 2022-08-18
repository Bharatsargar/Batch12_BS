package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_by {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement drp_btn=driver.findElement(By.xpath("//select[@name='country']"));
		
		Select sel=new Select(drp_btn);
		System.out.println(sel.getFirstSelectedOption().getText());

		sel.selectByIndex(2);
		Thread.sleep(2000);
		sel.selectByValue("INDIA");
		Thread.sleep(2000);
		sel.selectByVisibleText("ITALY");
		
	List<WebElement> list=sel.getOptions();
	
	for(int i=0;i<=list.size();i++) {
		String value=list.get(i).getText();
	System.out.println(value);
	if(value.equals("INDIA")) {
		sel.selectByVisibleText("INDIA");
		break;
	}
	}
		
		
		
		
		
		
	}

}
