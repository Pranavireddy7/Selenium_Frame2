package TestScripts;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import GenericLibrary.BaseTest;
@Listeners(GenericLibrary.ListenersImplements.class)
public class Carttest extends BaseTest {
	@Test(groups = "system")
	public void addtocart() throws InterruptedException, EncryptedDocumentException, IOException {
		//if(driver.getTitle().equals("Demo Web Shop")) {
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop");
			//System.out.println("Demo Web Shop page is displayed");
			Reporter.log("Demo web shop page is displayed,true");
		
		//else {
		//}		

		driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[5]/a")).click();
		if(driver.getTitle().equals("Demo Web Shop. Digital downloads")) {
			System.out.println("Demo Web Shop. Digital downloads page is displayed");
		}
		else {
			System.out.println("Demo Web Shop. Digital downloads page isnot displayed");
		}
		Thread.sleep(2000);
		List<WebElement> all = driver.findElements(By.xpath("//div[@class=\"center-2\"]//div/div/div/div[3]/div[2]/input"));
		Thread.sleep(2000);
		for (WebElement webElement : all) {
			webElement.click();
			Thread.sleep(2000);
		}
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		if(driver.getTitle().equals("Demo Web Shop. Shopping Cart"))
		{
			System.out.println("Demo Web Shop. Shopping Cart page is displayed");
		}
		else {
			System.out.println("Demo Web Shop. Shopping Cart page isnot displayed");
		}
		driver.findElement(By.xpath("//div[@class='center-1']/div/div[2]/div/form/table//td//input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='center-1']/div/div[2]/div/form/table//td//input)[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='center-1']/div/div[2]/div/form/table//td//input)[5]")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("updatecart")).click();


	}
}


