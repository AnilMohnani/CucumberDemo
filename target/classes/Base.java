package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
public static WebDriver driver;
public Properties prop = null;

	public WebDriver inialisation()
	{
		FileInputStream fis;
		try {
			 prop=new Properties();
			fis=new FileInputStream(System.getProperty("user.dir")+"//src//main//java//resources//global.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String browserName=prop.getProperty("browser");
		if(browserName.contains("chrome"))
		{
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else 
			if(browserName.contains("ff"))	
			{
				System.setProperty("firefox.chrome.driver", System.getProperty("user.dir")+"//drivers//firefoxdriver.exe");
				driver=new FirefoxDriver();

			}
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
		
	}
}
