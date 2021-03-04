package com.KaziProject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DoubleClicl2TestNG {
	// WebDriver driver = new ChromeDriver();
	public WebDriver driver;
//	public JavascriptExecutor jse;
	public Actions actions;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		//driver=new HtmlUnitDriver();
		actions = new Actions(driver);
		driver.manage().window().maximize();
	}

	@Test 
	public void Test1() throws InterruptedException {
		driver.get("https://demoqa.com");	
		Thread.sleep(3000);
	}

	@Test
	public void Test2() throws InterruptedException {
		driver.findElement(By.xpath("(//div[@class='category-cards']//div[@class='card-up'])[1]")).click();
		Thread.sleep(2000);
	}

	@Test
	public void Test3() throws InterruptedException {
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('item-4').click();");
		Thread.sleep(2000);
	}
	@Test 	
	public void Test4() throws InterruptedException {
		
		actions.doubleClick(driver.findElement(By.id("doubleClickBtn"))).perform();
		Thread.sleep(2000);
	}
	@Test
	public void Test5() throws InterruptedException {
		
		WebElement link = driver.findElement(By.id ("rightClickBtn"));
		actions.contextClick(link).perform();
		Thread.sleep(2000);
	}
	@Test
	public void Test6() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		Thread.sleep(2000);
	}
	@AfterClass
	public void quit() {
		driver.close();




	}

}
