package com.task.TaskForCustomMethod;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleMethod {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\automation testing tools\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/?affid=vcommission&affExtParam1=50714");
		WebElement findElement = driver.findElement(By.xpath("//button[text()='✕']"));
		findElement.click();
		sigleMethod("Men","Jeans");
	}
	
	public static void sigleMethod(String module,String subModule) {
	// TODO Auto-generated method stub
	//	Actions action = new Actions(driver);
		String s="//span[text()='$']";
		String val=s.replace("$", module);
		//String val1=s.replace("$", subModule);
		
		WebElement we = driver.findElement(By.xpath(val));
		we.click();
	//	 action.moveToElement(we).build().perform();
		    List<WebElement> s1=driver.findElements(By.xpath("//*[@class='_1KCOnI']"));
		    for(WebElement option : s1){
			    if(option.getText().equals(subModule)) {
			        System.out.println("Trying to select: "+subModule);
			        option.click();
			        break;
			    }		
		}
		 }
	}
