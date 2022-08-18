package Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Ss {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/?hl=en");
		String path="C:\\Users\\Param\\eclipse-workspace\\Bharat_BS_07\\ScreenShot";
		TakesScreenshot ts= (TakesScreenshot)driver;
//		File Src=ts.getScreenshotAs(OutputType.FILE);
//		File destn=new File(path+"\\Ss1.png");
//		FileUtils.copyFile(Src, destn);
		String rm=RandomString.make(3);

		driver.navigate().to("https://www.google.com/account/about/");
		File srs1=ts.getScreenshotAs(OutputType.FILE);
		File destn1=new File(path+"\\"+rm+".png");
		FileUtils.copyFile(srs1, destn1);



	}

}
