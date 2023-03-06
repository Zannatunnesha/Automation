import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseDriver {
	 WebDriver driver;
		static String baseurl = "https://career.techforing.com/";
	 @BeforeSuite
	 public void start() {
		 String browser = System.getProperty("browser", "chrome");
		 if(browser.contains("chrome")) {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
				driver.manage().window().maximize();
				 }else if (browser.contains("firefox")) {
					 WebDriverManager.firefoxdriver().setup(); 
					 driver = new FirefoxDriver();
					 driver.manage().window().maximize();
				 }else {
				WebDriverManager.edgedriver().setup(); 
				 driver = new EdgeDriver();
				 } }
	 @AfterSuite
 public void end() {
	 driver.quit();
		  }}
