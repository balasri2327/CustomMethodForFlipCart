package com.task.TaskForCustomMethod;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {
	static WebDriver driver;

public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "F:\\automation testing tools\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.co.in/webhp?authuser=1");
	autoComplete("iphone");

}
public static void	autoComplete(String searchName) throws AWTException {
	// TODO Auto-generated constructor stub
	WebElement findElement = driver.findElement(By.id("lst-ib"));
	findElement.sendKeys(searchName);
	Robot r = new Robot();
	r.delay(200);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
}

}
