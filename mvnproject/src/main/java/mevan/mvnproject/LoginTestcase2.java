package mevan.mvnproject;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import mevan.mvnproject.Signin_Unable_page;
import mevan.mvnproject.Signin_email_page;


public class LoginTestcase2 {
	
	//Signin_email_page emailpage;
	//Signin_pwd_page pwdpage;
	Signin_Unable_page signinunable;
	
	
	@Test
	public void Login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kishor janwade\\Desktop\\Yogesh khot\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com");
		
		Signin_email_page emailpage=new Signin_email_page(driver);
		
		PageFactory.initElements(driver, emailpage);
		
		emailpage.enteremailid("yogesh2324");
		signinunable = emailpage.clickNext();
		
		Thread.sleep(5000);
		signinunable.clickTerms();

		System.out.println("End of code");
		
	}

}
