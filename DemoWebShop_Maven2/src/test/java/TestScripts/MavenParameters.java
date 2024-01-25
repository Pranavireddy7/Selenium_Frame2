package TestScripts;

import java.time.Duration;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenParameters {
	@Test
	public void testcase()
	{
		String url = System.getProperty("URL");
		String email = System.getProperty("EMAIL");
		String password = System.getProperty("PASSWORD");
		
		System.out.println(url);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		
		
		
		
	}

	
	}
	
	

