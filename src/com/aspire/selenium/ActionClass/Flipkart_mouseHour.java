package com.aspire.selenium.ActionClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_mouseHour {
	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.chrome.driver";
		String value = "D:\\Aspire\\Eclipse Files\\SeleniumAugust22\\Softwares\\chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		WebElement mh = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		Actions act = new Actions(driver);
		act.moveToElement(mh).perform();
		Thread.sleep(2000);

		List<WebElement> options = driver.findElements(By.xpath("//a[@class='_1_3w1N']/ancestor::div[1]/following-sibling::div//li"));
		for (WebElement temp : options) {
			System.out.println(temp.getText());
		}
		Thread.sleep(5000);
		driver.close();
	}
}
