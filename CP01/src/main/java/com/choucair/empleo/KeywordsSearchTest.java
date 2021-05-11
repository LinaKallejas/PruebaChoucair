package com.choucair.empleo;

 import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Element;
import org.openqa.selenium.chrome.ChromeDriver;




public class KeywordsSearchTest {
	
//Crear objeto WebDriver 
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/empleos-testing/");
		
	}
	
     @Test
     public void testChoucairPage() {
    	 
    	 WebElement searchbox = driver.findElement(By.name("search_keywords"));
    	 searchbox.clear();
    	 searchbox.sendKeys("analista");
    	 searchbox.submit();
    	 driver.mange().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 assertEquals("analista - search_keywords", driver.getTitle());
    	
     }
     
     @After
     public void tearDown() {
    	 
    	 driver.quit();
     }
	}
	


