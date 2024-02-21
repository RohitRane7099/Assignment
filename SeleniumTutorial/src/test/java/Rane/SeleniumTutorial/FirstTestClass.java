package Rane.SeleniumTutorial;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.security.auth.spi.LoginModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class FirstTestClass {
	
	

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");
		
	WebElement username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
	
		username.sendKeys("standard_user");
		
		WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		
		Password.sendKeys("secret_sauce");
		
		WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		loginbtn.click();
		
		WebElement openMenuButton = driver.findElement(By.id("react-burger-menu-btn"));
		openMenuButton.click();
		
		WebElement aboutoption = driver.findElement(By.id("about-sidebar-link"));
		aboutoption.click();
		
		driver.navigate().to("https://saucelabs.com/ site");
		driver.navigate().back();
		
		List <WebElement>productprices = driver.findElements(By.className("inventory_item_price"));
		List<Double>numericprices = new ArrayList<Double>();
		for(WebElement priceElement:productprices){
		String priceText = priceElement.getText().replace("$", "$x");
		numericprices.add(Double.parseDouble(priceText));
		
		int indexofhighestprice = numericprices.indexOf(Collections.max(numericprices));
		productprices.get(indexofhighestprice).click();
			
		}
		
		WebElement cartButton = driver.findElement(By.id("shopping_cart_container"));
		cartButton.click();
	
		WebElement checkButton = driver.findElement(By.id("checkout"));
		checkButton.click();
		
		WebElement firstName = driver.findElement(By.id("first-name"));
		firstName.sendKeys("Rohit");
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		
		
		
	
		
		
		
	
		
	

		
	}

	
}