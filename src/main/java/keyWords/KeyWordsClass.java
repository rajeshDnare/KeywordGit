package keyWords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyWordsClass {
	public static WebDriver driver;
	
	public static void startBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	public static void getURL(String url) {
		driver.get(url);
	}
	
	public static void insertText(String locator, String text) {
		driver.findElement(By.cssSelector(locator)).sendKeys(text);
	}
	
	public static void click(String locator) {
		driver.findElement(By.cssSelector(locator)).click();
	}
	
	public static void closeBrowser() {
		driver.close();
	}

}
