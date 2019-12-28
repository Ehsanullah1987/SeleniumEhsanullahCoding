package com.class04;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;


public class CheckBoxDemo extends CommonMethods{
	
	public static final String HRMS_URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";


	public static void main(String[] args) {

		CommonMethods.setUp("chrome", HRMS_URL);
		driver.manage().window().fullscreen();
		
		WebElement loginBtn=driver.findElement(By.cssSelector("input#btnLogin"));
		
		System.out.println(loginBtn.isEnabled());
		
		
	}

}
