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
	
	goToPage(10);
		}
public static void goToPage(int pageNumber) {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "F:\\automation testing tools\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/?affid=vcommission&affExtParam1=50714");

	WebElement findElement = driver.findElement(By.xpath("//button[text()='✕']"));
	findElement.click();
	WebElement offer = driver.findElement(By.xpath("//span[text()='Offer Zone']"));
	offer.click();
	WebElement shirt = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
	shirt.sendKeys("Shirts",Keys.ENTER);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement find=driver.findElement(By.xpath("//div[@title='50% or More']"));

    
    String val=driver.findElement(By.xpath("//div[@title='50% or More']")).getText();
    String[] parts = val.split("% or");
    String part1 = parts[0]; // 004
    String part2 = parts[1]; // 034556
    
    if(pageNumber>Integer.parseInt(part1)) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", find);

        find.click();

    }else {
    	System.out.println("Fail");
    }
	
	}
}



