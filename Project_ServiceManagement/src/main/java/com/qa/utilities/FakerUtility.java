package com.qa.utilities;

import java.util.Locale;

import com.github.javafaker.*;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

public class FakerUtility {
	
	
	
 public static String clientName()
   {
	 Faker faker=new Faker();
	String clientname=faker.name().username();
	
	return clientname;
  }
  
 public static String company()
 {
	 Faker faker=new Faker();
	String compny=faker.name().firstName();
	
	return compny;
}
 public static String location()
 {
	 Faker faker=new Faker();
	String geoloc=faker.address().latitude();;
	
	return geoloc;
}
 public static String address()
 {
	 Faker faker=new Faker();
	String Addrs=faker.address().fullAddress();
	
	return Addrs;
}
 public static String city()
 {
	 Faker faker=new Faker();
	String cityname=faker.address().cityName();
	
	return cityname;
}
 public static String postalCode()
 {
	 Faker faker=new Faker();
	String code=faker.address().countryCode();
	
	return code;
}
 public static String telephone()
 {
	 Faker faker=new Faker();
	String phone=faker.phoneNumber().phoneNumber();
	
	return phone;
}
 public static String fakeValuesServiceEmail()
 {
     FakeValuesService fakeValuesService = new FakeValuesService(  new Locale("en-GB"), new RandomService());
     String email = fakeValuesService.bothify("????##@gmail.com");
    
     return email;
}
 public static String vat()
 {
	 Faker faker=new Faker();
	String vatmail=faker.idNumber().ssnValid();
	
	return vatmail;
}
 public static String ssn()
 {
	 Faker faker=new Faker();
	String SSN=faker.idNumber().ssnValid();
	
	return SSN;
 }
}
 


