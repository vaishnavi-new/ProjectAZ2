package CommonClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingElements
{
	@Test
	public static void one()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\vaish\\eclipse-workspace\\SeleniumProjectNew\\Drivers\\chromedriver.exe");
        WebDriver driver = (WebDriver) new ChromeDriver();
        
        
    }
}
