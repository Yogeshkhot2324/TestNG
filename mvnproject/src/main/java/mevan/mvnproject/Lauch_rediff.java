package mevan.mvnproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Lauch_rediff {

	
	WebDriver localdriver;
	public Lauch_rediff(WebDriver driver)
	{
		this.localdriver = driver;
	}
	
	@FindBy(xpath="//a[contains(text(),'Sign In')]")
	public WebElement signin;
	
	public void clickNext() {
		signin.click();
	}
	
	@FindBy(xpath="//input[@id='useremail']")
	public WebElement username;
	
	
	@FindBy(xpath="//input[@id='userpass']")
	public WebElement password;
	
	
	public void entercrenditials( String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
	}
	
	@FindBy(xpath="//input[@id='loginsubmit']")
	public WebElement submitbutton;
	
	public void submit() {
		submitbutton.click();
		
		
	}
	@FindBy(xpath="//a[@id='createPortfolio']")
	public WebElement createPFButton;
	
	public void clickcreatePF() {
		createPFButton.click();
	}
	
		
	
	@FindBy(xpath="//input[@id='create']")
	public WebElement create1;
	
	
	@FindBy(xpath="//input[@id='createPortfolioButton']")
	public WebElement create2;
	
	
	 public void abc(String name)
	 {
		 create1.sendKeys(name);
	 }
	 public void abc1() {
		 create2.click();
	 }
}
