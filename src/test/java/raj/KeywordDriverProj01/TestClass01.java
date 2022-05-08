package raj.KeywordDriverProj01;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import keyWords.KeyWordsClass;

public class TestClass01 {
	public WebDriver driver;
	
	@BeforeTest
	public void invokeBrowser() {
		KeyWordsClass.startBrowser();
	}
	
	@Test
	public void test01() {
		String url = "https://www.saucedemo.com/";
		String locator01="input[id=\"user-name\"]";
		String user="standard_user";
		String locator02="input[id=\"password\"]";
		String pass="secret_sauce";
		String button="input[id=\"login-button\"]";
		
		
		KeyWordsClass.getURL(url);
		KeyWordsClass.insertText(locator01, user);
		KeyWordsClass.insertText(locator02, pass);
		KeyWordsClass.click(button);
		KeyWordsClass.closeBrowser();
		
	}

}
