package Simple_code;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
	public WebDriver driver;
	
	  @BeforeMethod
	  public void beforeMethod() {
		  
		  ///driver=new FirefoxDriver();
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\Storage\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
	  }
  @Test
  public void f() {
	  
	  String title=driver.getTitle();
	  System.out.println("Tital is  :"+title);
	  Assert.assertEquals("Google", title);
  }


  @AfterMethod
  public void afterMethod() {
  }

}
