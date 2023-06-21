package com.qa.testscript;

import java.io.IOException;

import org.testng.annotations.Test;
import com.qa.pages.LoginPages;
import com.qa.servicemanagementproject.Base;

public class LoginTest extends Base
{
    LoginPages loginpage;

@Test
public void login() throws IOException {

		loginpage=new LoginPages(driver);
		loginpage.validLogin();
      }
@Test
public void logOut() throws IOException {
	
	loginpage=new LoginPages(driver);
	loginpage.logout();
}
 

}

