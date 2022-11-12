package com.adacitin.pagefactory;

import org.openqa.selenium.By;

public class HomePageFactory {

	private String UserId="username";

	public String getUserId() {
		return UserId;
	}
     public String passwordId="password";
     
     public String getPasswordId() {
		return passwordId;
	}

	
	public By login=By.id("login");
	
	}
	

