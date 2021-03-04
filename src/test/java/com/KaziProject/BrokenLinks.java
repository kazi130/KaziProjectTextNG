package com.KaziProject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com");	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@class='category-cards']//div[@class='card-up'])[1]")).click();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('item-6').click();");
		Thread.sleep(2000);
		
	//	jse.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("//a[contains(text(),'Click Here for Valid Link')]")).click();
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//a[contains(text(),'Click Here for Broken Link')]")).click();
	//	Thread.sleep(2000);


	}

}
//a[contains(text(),'Click Here for Valid Link')]
//a[contains(text(),'Click Here for Broken Link')]