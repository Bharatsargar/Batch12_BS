package Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Shift_btn {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement gmail=driver.findElement(By.xpath("//input[@name='email']"));
		
		Actions act=new Actions(driver);
		act.keyDown(gmail, Keys.SHIFT).sendKeys("bharat").keyUp(Keys.SHIFT).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
		pass.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));
		btn_login.sendKeys(Keys.ENTER);

		String path="C:\\Users\\Param\\eclipse-workspace\\Bharat_BS_07\\ScreenShot";
		String rm=RandomString.make(3);
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File(path+"\\"+rm+".png");
		FileUtils.copyFile(src, destn);
		
		
		
	}

}
