package com.basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
	
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://accounts.google.com");
		
		
		
		//String xp="(//div[@class='nM'])/div/div";
		
		
		//String text="//p[text()='Use another account']";
	//	driver.findElement(By.xpath(text)).click();
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("madhur"+Keys.ENTER);
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_R);
		
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("madhurivgowda"+Keys.ENTER);
		/*driver.findElement(By.xpath("//input[@name='password']")).sendKeys(""+Keys.ENTER);
		Thread.sleep(8000);
		
		
		driver.findElement(By.xpath("//a[@href='https://mail.google.com']")).click();
		``````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````
		
		
		
		
		
		
		
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ```````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````````
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
		
		int count=0;
		
		List<WebElement> gmail=driver.findElements(By.xpath("//div[@class='aim']/div/div/div/span/a"));
		//System.out.println("size of"+gmail.size());
		for(int i=0;i<gmail.size()-1;i++){
			count++;
			System.out.println(gmail.get(i).getText());
		}
		
		System.out.println(count);
		
		
		
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*driver.findElement((By.name("cusid"))).sendKeys("1234");
		driver.findElement((By.name("submit"))).click();
		//to switch to alert
		Alert alert=driver.switchTo().alert();
		//to capture alert msg
		String msg = driver.switchTo().alert().getText();
		System.out.println(msg);
		
		alert.accept();
		
		Thread.sleep(500);
	//	Alert alert1=driver.switchTo().alert();
		alert.accept();*/
	}

}
