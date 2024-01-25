package TestScripts;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ElementRepository.HomePage;
import ElementRepository.RegisterPage;
import GenericLibrary.BaseTest;
import GenericLibrary.CommonUtility;
import GenericLibrary.DataUtility;

public class RegistrationTest extends BaseTest {

@Test(groups = "Integration", dataProvider = "Register")

public void registerTestCase(String firstname, String lastName,String email, String password, String confirmpassword) {
	//public void register() throws EncryptedDocumentException, IOException {
	
	DataUtility data_utility = new DataUtility();
	CommonUtility common_utility = new CommonUtility();
	
	String modEmail = common_utility.getRandomNumber()+email;
	
	//launchTheBrowser();	
	HomePage hp=new HomePage(driver);
	hp.getRegister_link();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Register");
//		if(driver.getTitle().equals("Demo Web Shop. Register")) {
//			System.out.println("Demo Web Shop. Register page is displayed");
//		}
//		else {
		Reporter.log("Demo Web Shop. Register page is not dispalyed");
//			System.out.println("Demo Web Shop. Register page is not dispalyed");
//		}
//		driver.findElement(By.id("gender-female")).click();
//		Object keys;
//		driver.findElement(By.id("firstname")).sendkeys("np",keys.tab,"npr",keys.tab,"pranu@gmail.com",keys.tab,"123456@","123456@");
//		driver.findElement(By.id("register-button")).click();
//		driver.findElement(By.xpath("//input[@value='Continue']")).click();
//		//Close();

		
		RegisterPage register_page = new RegisterPage(driver);
		register_page.getFemaleRadioButton().click();
		register_page.getFirstNameTextField().sendKeys(firstname);
		register_page.getLastNameTextField().sendKeys(lastName);
		register_page.getEmailTextField().sendKeys(modEmail);
		register_page.getPasswordTextField().sendKeys(password);
		register_page.getConfirmPasswordTextField().sendKeys(confirmpassword);
		register_page.getRegisterButton().click();
	
}
 @DataProvider(name = "Register")
public Object[][] dataSupply() throws EncryptedDocumentException, IOException {
	return DataUtility.getAllDataFromExcel("Sheet1");
}

}