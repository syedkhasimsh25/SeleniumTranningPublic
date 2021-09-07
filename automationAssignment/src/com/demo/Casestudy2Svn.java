package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Casestudy2Svn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\00004001\\Desktop\\Automation training\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.get("https://www.google.co.in/");
	    int buttonNum=myD.findElements(By.xpath("//*[@type='submit']")).size();
		System.out.println("Number of buttons : " + buttonNum);

		int vLink = myD.findElement()
	}

}
