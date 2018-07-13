package org.itstep;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriverService.Builder;
import org.openqa.selenium.support.ui.Select;

public class FacebookTest {

	private static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Tester\\Softwear\\Selenium\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void test() {
		driver.findElement(By.id("u_0_j")).sendKeys("Sigizmund");
		driver.findElement(By.id("u_0_l")).sendKeys("Water");
		driver.findElement(By.id("u_0_o")).sendKeys("+30676607096");
		driver.findElement(By.id("u_0_v")).sendKeys("123456fqw");
		Select select1 = new Select(driver.findElement(By.id("day")));
		select1.selectByValue("10");
		Select select2 = new Select(driver.findElement(By.id("month")));
		select2.selectByValue("1");
		Select select3 = new Select(driver.findElement(By.id("year")));
		select3.selectByValue("1966");
		WebElement sex = driver.findElement(By.id("u_0_7"));
		if(!sex.isEnabled()) {
			sex.click();
		}
		//driver.findElement(By.id("u_0_11")).submit();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("");
		
		Builder builder = new Builder();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}
}