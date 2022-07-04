package Mindtree.Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assessment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com");
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		WebElement webdriver=driver.findElement(By.linkText("Personal Finance"));
		action.moveToElement(webdriver).build().perform();
		
		//driver.findElement(By.xpath("//a[class='arrow down']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Income Tax Calculator")).click();
		driver.findElement(By.xpath("//span[@class='styspri icradio_mid checked']")).click();
		driver.findElement(By.xpath("//input[@name='age']")).sendKeys("11");
		driver.findElement(By.xpath("//*[@class='inputrange']")).click();
		
	}

}
