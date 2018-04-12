package com.task.TaskForCustomMethod;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {
	static WebDriver driver;

public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "F:\\automation testing tools\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.co.in/webhp?authuser=1");
	WebElement autoOptions= driver.findElement(By.id("lst-ib"));
	autoOptions.sendKeys("iphone");
	Thread.sleep(2000);

	autoComplete("iphone 7");

}
public static void	autoComplete(String searchName) throws AWTException {
	// TODO Auto-generated constructor stub
	List<WebElement> searchElement = driver.findElements(By.xpath("//div[@class='sbqs_c']"));
	for(WebElement option : searchElement){
	    System.out.println(option);
	    if(option.getText().equals(searchName)) {
	        System.out.println("Trying to select: "+searchName);
	        option.click();
	        break;
	    }		
}

}
}