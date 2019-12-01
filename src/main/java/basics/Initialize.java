package basics;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialize {
	public static Properties prop;
	public static WebDriver driver;
	
	
	public Initialize() throws Exception {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\aathi\\eclipse-workspace\\CricBuzzCucumbebr\\src\\main\\java\\basics\\Config.properties");
		prop.load(ip);
		
		
		
	}

	public static void initialize(){
		

	System.setProperty("webdriver.chrome.driver", "E:\\softwares\\hashwa\\Drivers\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(prop.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	System.out.println("Initialization completed");
	}
}
