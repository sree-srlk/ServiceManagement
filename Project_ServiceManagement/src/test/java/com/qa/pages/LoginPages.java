package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.utilities.ExcelUtility;
import com.qa.utilities.PageUtility;

public class LoginPages
{
	public WebDriver driver;

    public LoginPages(WebDriver driver) {
           this.driver = driver;
           PageFactory.initElements(driver, this);
     }
    
	@FindBy(name = "identity") WebElement userName;
    @FindBy(name = "password") WebElement passWord;
	@FindBy(name = "submit")   WebElement submit;
    @FindBy(name = "remember")WebElement rememberMeBox;
    @FindBy(linkText = "Forgot your password?") WebElement forgotPasswordLink;
    @FindBy(linkText = "Back to home page") WebElement backToHomeLink;
    @FindBy(xpath="//p[text()='Logged In Successfully']") WebElement alertMessage;
    @FindBy(xpath="(//span[text()='Joe Jacobs'])[1]") WebElement name;
    @FindBy(xpath="//a[text()='Sign out']") WebElement signout;
    @FindBy(xpath="//p[text()='Logged Out Successfully']") WebElement logOutMessage;
  
    
    

	public void validLogin() throws IOException {

		String username=ExcelUtility.getString(1, 0, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet");
        String password=ExcelUtility.getString(1, 1, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet");
        String expectedMessage=ExcelUtility.getString(1, 2, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet");

		PageUtility.enterText(userName,username);
		PageUtility.enterText(passWord, password);
		PageUtility.isDisplayed(submit);
		PageUtility.clickOnElement(submit);

		String actualMessage=PageUtility.getElementText(alertMessage);

		Assert.assertEquals(actualMessage, expectedMessage, "Login Failed");

	}
	public void logout() throws IOException {
		PageUtility.clickOnElement(name);
		PageUtility.clickOnElement(signout);
		PageUtility.clickOnElement(submit);
		String expectedMessage=ExcelUtility.getString(1, 3, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet");
		String actualMessage=PageUtility.getElementText(logOutMessage);
		Assert.assertEquals(actualMessage, expectedMessage, "Logout Failed");
	}



}


