package com.task.TaskForCustomMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomMethod {
	static WebDriver driver;
	

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\automation testing tools\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/?affid=vcommission&affExtParam1=50714");

	customPage(62);
		}
public static void customPage(int pageNumber) {
	// TODO Auto-generated method stub
	
	WebElement popupClose = driver.findElement(By.xpath("//button[text()='✕']"));
	popupClose.click();
	WebElement offerZone = driver.findElement(By.xpath("//span[text()='Offer Zone']"));
	offerZone.click();
	WebElement shirtText = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
	shirtText.sendKeys("Shirts",Keys.ENTER);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement discountChxBox=driver.findElement(By.xpath("//div[@title='50% or More']"));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", discountChxBox);
    discountChxBox.click();

    String val=driver.findElement(By.xpath("//div[text()='62']")).getText();
    String s="//div[text()='$']";
    String rep=s.replace("$", String.valueOf(pageNumber));
    String[] parts = val.split("% off");
    String part1 = parts[0]; // 004
    System.out.println(part1);
    if(pageNumber==Integer.parseInt(part1)) {
    	WebElement find1=driver.findElement(By.xpath(rep));
    	find1.click();

    }else {
    	System.out.println("Fail");
    }
	
	}
}



