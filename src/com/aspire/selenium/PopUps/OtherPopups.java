package com.aspire.selenium.PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtherPopups 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		Thread.sleep(2000);
// alert box
		driver.findElement(By.id("alertBox")).click();
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());    //System.out.println(driver.switchTo().alert().getText());
		al.accept();        // driver.switchTo().alert().accept();
		Thread.sleep(2000);
// confirm box
		driver.findElement(By.id("confirmBox")).click();
		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
		al.dismiss();
		Thread.sleep(2000);
// prompt box
		driver.findElement(By.id("promptBox")).click();
		System.out.println(al.getText());
		al.sendKeys("viraj");
		al.accept();
		Thread.sleep(2000);
		driver.close();
	}

}
