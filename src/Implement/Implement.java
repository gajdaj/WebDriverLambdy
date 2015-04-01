package Implement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import interfaces.*;
public class Implement {
	
	public static WebDriver driver = null;
	public static String wartoscWpisz;
	public static ElementOperation kliknij = (WebElement e) -> e.click();
	public static ElementOperation wpisz = (WebElement e) -> e.sendKeys(wartoscWpisz);
	public static SetElement idElement = (String s) -> driver.findElement(By.id(s));
	
	public Implement() {
		if(driver == null){
			driver = new FirefoxDriver();
			driver.get("http://www.facebook.com");
		}
	}
	
	public void closeDriver(){
		driver.quit();
	}

}
