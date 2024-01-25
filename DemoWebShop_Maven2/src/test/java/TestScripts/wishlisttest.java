package TestScripts;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericLibrary.BaseTest;
import GenericLibrary.DataUtility;


public class wishlisttest extends BaseTest {
	
	@Test(groups = "system")
	public void wishlist()throws InterruptedException, EncryptedDocumentException, IOException {
	//launchbrowser();
	login();	
		
	driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[1]/a[1]")).click();
	Thread.sleep(2000);
		if(driver.getTitle().equals("Demo Web Shop")) {
			System.out.println("Demo Web Shop page is displayed");
		}
		else {
			System.out.println("Demo Web Shop page is not displayed");
		}		
	WebElement book = driver.findElement(By.xpath("//a[text()='Fiction EX']"));
		
	String product = book.getText();
	book.click();
		
	Thread.sleep(2000);

		if(driver.getTitle().equals("Demo Web Shop. Fiction EX")) {
			System.out.println("Fiction page is displayed");
		}
		else {
			System.out.println("Fiction page is not displayed");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Add to wishlist']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		Thread.sleep(2000);
		if(driver.getTitle().equals("Demo Web Shop. Wishlist")) {
			System.out.println("Wishlist page is displayed");
		}
		else {
			System.out.println("Wishlist page is not displayed");
		}
		WebElement all = driver.findElement(By.xpath("//a[text()='Fiction EX']"));
	
		Thread.sleep(2000);
		if(all.getText().equals(product)) {
			System.out.println("Adding book test case is passed");
			common_Utility.takeScreenShot(driver,"wishlist");
		}
		else {
			System.out.println("Test case is failed");
		}
		
		driver.findElement(By.name("removefromcart")).click();
			driver.findElement(By.xpath("//input[@name='updatecart']")).click();		 			
			
			logout();
			Thread.sleep(2000);
            driver.close();
		

	}

	private void login() {
		// TODO Auto-generated method stub
		
	}

}