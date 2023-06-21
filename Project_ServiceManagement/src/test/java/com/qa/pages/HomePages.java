package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.utilities.ExcelUtility;
import com.qa.utilities.PageUtility;
import com.qa.utilities.WaitUtility;

public class HomePages 
{
	public WebDriver driver;

    public HomePages(WebDriver driver) {
           this.driver = driver;
           PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//p[text()='Logged In Successfully']") WebElement logInMessage ;
    @FindBy(xpath="//i[@class='fa fa-plus-circle']") WebElement addIcon;
    @FindBy(xpath="//span[@class='fa fa-user-plus icon']") WebElement addClient;
    @FindBy(xpath="//h4[text()='Add Client']") WebElement message;
    @FindBy(xpath="//span[@class='fa fa-list-alt icon']") WebElement addReparation ;
    @FindBy(xpath="//h4[text()='Add Reparation']") WebElement addRepMsg;
    @FindBy(xpath="//span[@class='fa fa-comment icon']") WebElement sendSms;
    @FindBy(xpath="//h5[text()='Send SMS']") WebElement sendSMSMessage;
    
    public void verifyNavigateToClientPage() throws IOException {
        
    	PageUtility.clickOnElement(addIcon);
    	WaitUtility.presenceOfElementLocatedBy(driver, By.xpath("//i[@class='fa fa-plus-circle']"));
    	PageUtility.clickOnElement(addClient);
    	
        String expectedMessage=ExcelUtility.getString(1, 4, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet");
        String actualMessage=PageUtility.getElementText(message);
        Assert.assertEquals(actualMessage, expectedMessage, "Test Failed");
       }
    public void verifyNavigateToAddReparation() throws IOException {
        
    	PageUtility.clickOnElement(addIcon);
    	WaitUtility.presenceOfElementLocatedBy(driver, By.xpath("//i[@class='fa fa-plus-circle']"));
    	PageUtility.clickOnElement(addClient);
    	
        String expectedMessage=ExcelUtility.getString(1, 4, System.getProperty("user.dir")+"constants.Constant.TESTDATAFILE", "testSheet");
        String actualMessage=PageUtility.getElementText(message);
        Assert.assertEquals(actualMessage, expectedMessage, "Test Failed");
       }
}
