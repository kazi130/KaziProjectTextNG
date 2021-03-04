package com.KaziProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestBuyPageFactory {
	@FindBy(xpath="//button[@class='c-close-icon  c-modal-close-icon']")
	static WebElement cancelButton;
	
	@FindBy(id="gh-search-input")
	static WebElement searchBox;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://bestbuy.com");
		
		
		BestBuyPageFactory bb = new BestBuyPageFactory();
		bb = PageFactory.initElements(driver, BestBuyPageFactory.class);
		
		cancelButton.click();
        Thread.sleep(2000);
        searchBox.sendKeys("Laptop");
        searchBox.submit();
        Thread.sleep(2000);
		
		driver.close();
		
		
		
	
	}
	
}
