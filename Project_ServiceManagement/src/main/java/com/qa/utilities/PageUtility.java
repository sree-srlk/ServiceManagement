package com.qa.utilities;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility 
{
  public static void clickOnElement(WebElement element)
  {
	element.click();  
  }
  
  public static String getElementText(WebElement element)
  {
	return element.getText();
 }
  public static WebElement enterText(WebElement element,String value)
  {
	  element.sendKeys(value);
	  return element;
  }
  public static void clickAndHold(WebDriver driver)
  {
	  Actions act=new Actions(driver);
	act.clickAndHold().perform();
  }
  public static void selectDropDownByText(WebElement element, String text)
  {
	  Select obj1=new Select(element);
	  obj1.selectByVisibleText(text);
   }
  public static void selectDropDownByValue(WebElement element, String value)
  {
	  Select obj2=new Select(element);
	  obj2.selectByVisibleText(value);
   }
  public static boolean isDisplayed(WebElement element)
  {
	  return element.isDisplayed();
  }
  public static boolean isEnabled(WebElement element)
  {
	  return element.isEnabled();
  }
  public static boolean isSelected(WebElement element)
  {
	  return element.isSelected();
  }
  public static void scrollBy(WebDriver driver)
  {
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
  }
  public static void stopPageRefresh(WebDriver driver)
  {
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("window.stop();");
  }
  public static int getElementRowSize(List<WebElement> element)
  {
	  return element.size();
  }
  public static int getElementColumnSize(List<WebElement> element)
  {
	  return element.size();
  }
  
   
  
  
  
}

