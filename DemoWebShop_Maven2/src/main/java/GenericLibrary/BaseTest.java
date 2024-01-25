package GenericLibrary;

import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.beust.jcommander.Parameters;

public class BaseTest {
	
	 public DataUtility data_Utility = new DataUtility();
	public CommonUtility common_Utility=new CommonUtility();
	public WebDriver driver; 
	public static WebDriver listernersDriver;
	
	
	@org.testng.annotations.Parameters("Browser")
	@BeforeClass(alwaysRun = true)
	public void launchbrowser(String browserName) throws FileNotFoundException 
	{
		Object WebDriver;
		if(browserName.equals("Chrome"))
		{
			driver = new ChromeDriver();
			
		}
		else if (browserName.equals("Edge"))
		{
			driver = new EdgeDriver();
		}
			listernersDriver=driver;
		org.openqa.selenium.WebDriver listenersDriver = driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(data_Utility.getDataFromProperties("url"));

	}
	@BeforeMethod(alwaysRun = true)
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("email");
	}


	@AfterMethod(alwaysRun = true)
	public void logout() {
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	@AfterClass(alwaysRun = true)
	public void closeBrowser() 
	{
		driver.close();
	}
}











