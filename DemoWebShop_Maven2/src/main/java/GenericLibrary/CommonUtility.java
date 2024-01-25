package GenericLibrary;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class CommonUtility {
Select s;
public int getRandomNumber()
{
	Random r = new Random();
    return r.nextInt(1000);
	
}

	public void takeScreenShot(WebDriver driver,String name) {
		String path = FrameWorksConstants.screenshot_path+name+".png";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scr=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./ScreenShot/"+name+".png");
		try {
			FileHandler.copy(scr, trg);
		}
		catch (IOException e) {
// TODO: handle exception
			e.printStackTrace();
		}
		}
	
	public void acceptAlertPopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
		public void dissmissAlertPopup(WebDriver driver) {
			driver.switchTo().alert().dismiss();
		}
		
		public void selectDropDownByIndex(WebElement dropDown, int indexNum)
		{
			 s=new Select(dropDown);
			 s.selectByIndex(indexNum);
			 
		}
		public void selectDropDownByVisibleText(WebElement dropDown, String text)
		{
			s=new Select(dropDown);
			s.selectByVisibleText(text);
			
		}
		public void selectDropDownByValue(WebElement dropDown, String value)
		{
			s=new Select(dropDown);
			s.selectByValue(value);
			
		}
	}

