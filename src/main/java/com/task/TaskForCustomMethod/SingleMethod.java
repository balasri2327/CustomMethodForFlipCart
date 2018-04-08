package com.task.TaskForCustomMethod;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingleMethod {
	static WebDriver driver;

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);     
		   System.out.println("Enter Flipcart Page name");  
		   String page=sc.next();  
		System.setProperty("webdriver.chrome.driver", "F:\\automation testing tools\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/?affid=vcommission&affExtParam1=50714");
		   goToPage(page);
	}
	
	public static void goToPage(String pageName) {
	// TODO Auto-generated method stub
		WebElement findElement = driver.findElement(By.xpath("//button[text()='✕']"));
		findElement.click();
		Actions action = new Actions(driver);
		String s="//span[text()='$']";
		String val=s.replace("$", pageName);
		WebElement we = driver.findElement(By.xpath(val));
		 action.moveToElement(we).build().perform();
		 if(pageName.equals("Men")) {
		    WebDriverWait wait = new WebDriverWait(driver,30);
		    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='Wbt_B2 _3mmoXN']//a[@title='Jeans']")));
		    driver.findElement(By.xpath("//li[@class='Wbt_B2 _3mmoXN']//a[@title='Jeans']")).click();
		 }
	}
}
