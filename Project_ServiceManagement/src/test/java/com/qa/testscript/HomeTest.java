package com.qa.testscript;

import java.io.IOException;

import org.testng.annotations.Test;
import com.qa.pages.HomePages;
import com.qa.pages.LoginPages;
import com.qa.servicemanagementproject.Base;

public class HomeTest extends Base
{
  HomePages HomePage;
  
  @Test
  public void addClient() throws IOException {

  		HomePage=new HomePages(driver);
  		HomePage.verifyNavigateToClientPage();
  }
  
 
}
