package com.basics;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class uniquely {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
		                                                                                                                                                                                                                                                                                                                                                                                                            
		System.setProperty("webdriver.firefox.marionette","/home/tyss/Desktop/Softwares/geckodriver");                                                                                                                                                                                                                                                                                                                                                     
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("file:///home/tyss/Desktop/cars1.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("cars"));
		Select option=new Select(ele);
		HashSet alltext=new HashSet();
		List <WebElement> opt =option.getOptions();
		for(int i=0;i<opt.size();i++)
		{
			String text = opt.get(i).getText();
			if(alltext.add(text)==false)
			{
				System.out.println("Duplicates r n present "+text);
			}
			
		}
	
	}
}
                                                                                                                                                                                                                                                                                     