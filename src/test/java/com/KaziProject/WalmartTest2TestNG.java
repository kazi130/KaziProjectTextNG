package com.KaziProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WalmartTest2TestNG {
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		 System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
	 driver = new ChromeDriver();
		// driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
	}
		@Test
		public void Test1() throws InterruptedException {
		driver.get("https://walmart.com");
		Thread.sleep(2000);
		}
		@Test
		public void Test2() throws InterruptedException {
		driver.findElement(By.id("global-search-input")).sendKeys("laptop");
		Thread.sleep(2000);
		}
		@Test
		public void Test3() throws InterruptedException {
		driver.findElement(By.id("global-search-submit")).click();
		Thread.sleep(2000);
		}
		@Test
		public void Test4() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='search-result-product-title gridview']")).click();
		Thread.sleep(2000);
		}
		@Test
		public void Test5() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='spin-button-children']")).click();
		Thread.sleep(2000);
		}
		@Test
		public void Test6() throws InterruptedException {
		driver.findElement(By.xpath("//div[@class='new-ny-styling cart-pos-proceed-to-checkout']")).click();
		Thread.sleep(2000);
		}
		@Test
		public void Test7() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='button-wrapper']")).click();
		Thread.sleep(2000);
		}
		@AfterClass
		public void quit() {
			driver.close();
		}
	}

	
 //  (//div[@class='sku-title'])[1] unic xpath

  //  public Object getExcelData1(String fileName, String sheetName) {
	//String[][] arrayExcelData = null;
	//try {
	//	FileInputStream fs = new FileInputStream(fileName);
	//	XSSFWorkbook workbook= new XSSFWorkbook(fs);
		
	//	XSSFSheet sheet=workbook.getSheet("Sheet1");


	


