package Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scr_take {

	public static void main(String[] args) throws IOException, Exception {

		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.bing.com/search?q=maven+repository&qs=LS&pq=maven&sc=10-5&cvid=2510CC880DCE449FA8F3DB28A6407A60&FORM=QBRE&sp=1");
		
		String path="C:\\Users\\Param\\eclipse-workspace\\Bharat_BS_07\\ScreenShot";
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File destn=new File(path+"\\test.ex.png");
		FileUtils.copyFile(src, destn);
		Thread.sleep(2000);
		
		driver.navigate().to("https://github.com/git-guides");
		String path1="C:\\Users\\Param\\eclipse-workspace\\Bharat_BS_07\\ScreenShot";
		
		TakesScreenshot ts1=(TakesScreenshot)driver;
		 
		File src1=ts1.getScreenshotAs(OutputType.FILE);
		File destn1=new File(path+"\\test1.ex.png");
		FileUtils.copyFile(src1, destn1);
		
	}

}
