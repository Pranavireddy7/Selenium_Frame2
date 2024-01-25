package ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	@FindBy(id="gender-male")
	private WebElement maleRadioButton;
		
	@FindBy(id="gender-female")
	private WebElement femaleRadioButton;
	
	@FindBy(name="FirstName")
	private WebElement firstNameTextField;
		
	@FindBy(css="[id='LastName']")
	private WebElement lastNameTextField;
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement emailTextField;

	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPasswordTextField;
	
	@FindBy(id="register-button")
	private WebElement registerButton;
	
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public void setMaleRadioButton(WebElement maleRadioButton) {
		this.maleRadioButton = maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public void setFemaleRadioButton(WebElement femaleRadioButton) {
		this.femaleRadioButton = femaleRadioButton;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public void setFirstNameTextField(WebElement firstNameTextField) {
		this.firstNameTextField = firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public void setLastNameTextField(WebElement lastNameTextField) {
		this.lastNameTextField = lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public void setEmailTextField(WebElement emailTextField) {
		this.emailTextField = emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public void setPasswordTextField(WebElement passwordTextField) {
		this.passwordTextField = passwordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	public void setConfirmPasswordTextField(WebElement confirmPasswordTextField) {
		this.confirmPasswordTextField = confirmPasswordTextField;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public void setRegisterButton(WebElement registerButton) {
		this.registerButton = registerButton;
	}
	
	

	
	
	
	
	
	
	}

