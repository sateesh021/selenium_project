package org.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertnew {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement one = driver.findElement (By.xpath("//*[@id=\"OKTab\"]/button"));
		one.click();
		Thread.sleep(3000);
		Alert ac = driver.switchTo().alert();
		ac.accept();
		Thread.sleep(3000);
		WebElement two = driver.findElement (By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		two.click();
		Thread.sleep(3000);
		WebElement three = driver.findElement (By.xpath("//*[@id=\"CancelTab\"]/button"));
		three.click();
		Thread.sleep(3000);
		Alert diss = driver.switchTo().alert();
		diss.dismiss();
		Thread.sleep(3000);
		WebElement four = driver.findElement (By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		four.click();
		Thread.sleep(3000);
		WebElement five = driver.findElement (By.xpath("//*[@id=\"Textbox\"]/button"));
		five.click();
		Thread.sleep(3000);
		Alert txt = driver.switchTo().alert();
		txt.sendKeys("ok");
		txt.accept();
		
		
	}

}
