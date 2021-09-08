package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Casestudy3Svn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004001\\Desktop\\Automation training\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.get("https://www.google.co.in/");
	    int vLinkHG1=myD.findElements(By.className("gb_f")).size();
		System.out.println("Number of Links in Header G1 : " + vLinkHG1);
		

	}

}
