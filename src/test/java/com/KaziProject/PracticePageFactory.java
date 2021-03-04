package com.KaziProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticePageFactory {
	
	@FindBy(xpath="//a[@href='/abtest']") static WebElement link1;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://the-internet.herokuapp.com");	

		PracticePageFactory ppf = new PracticePageFactory();
		ppf = PageFactory.initElements(driver, PracticePageFactory.class);
	
		link1.click();
		Thread.sleep(2000);
		
		driver.close();
		
		

	}

}
