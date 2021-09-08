package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

public class CaseStudyMousehandlingSvn {
	
	public static void main(String[] args) throws InterruptedException {

	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\00004001\\Desktop\\Automation training\\chromedriver.exe");
	WebDriver myD = new ChromeDriver();
	myD.get("https://www.amazon.in/");
	
     Actions act=new Actions (myD);
     act.moveToElement(myD.findElement(By.id("nav-link-accountList"))).build().perform();
     Thread.sleep(1000);
     myD.findElement(By.id("nav-flyout-ya-signin")).click();
    String vTit = ("Title is : " +myD.getTitle());
    System.out.println (vTit);
    
     if (vTit.contentEquals("Amazon Sign In"))
    		 {
    	 
    	 System.out.println ("Pass");
    	 
    	  }
     else 
     {
    	 System.out.println("Fail");
     }
     
     myD.close();
     
	}
}

