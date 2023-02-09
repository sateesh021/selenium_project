package org.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://flipkart.com/");
		driver.manage().window().maximize();
		WebElement from1 = driver.findElement (By.xpath("/html/body/div[2]/div/div/button"));
		from1.click();
		Thread.sleep(3000);
		WebElement ser = driver.findElement (By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
		ser.sendKeys("mobiles");
		WebElement search = driver.findElement (By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button"));
		search.click();

}
}