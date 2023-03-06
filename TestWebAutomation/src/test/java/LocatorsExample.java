import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorsExample extends BaseDriver {
	@Test(priority = 0)
	public void openUrl() throws InterruptedException{
		driver.get("https://career.techforing.com/auth");
			driver.manage().window().maximize();
			Thread.sleep(5000);
	}
	@Test(priority = 1)
	public void testLocators() throws InterruptedException{
		WebElement id = driver.findElement(By.id("email"));
		id.sendKeys("oyshetasnim123@gmail.com");
		Thread.sleep(5000);
	
		WebElement name = driver.findElement(By.name("password"));
		name.sendKeys("Oyshe1234");
		Thread.sleep(5000);

		WebElement signinText = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[3]/div[2]/form[1]/button[1]"));
		signinText.click();
		Thread.sleep(10000);
		
		WebElement button = driver.findElement(By.xpath("//header/div[1]/div[2]/button[1]/div[1]/img[1]"));
		button.click();
		Thread.sleep(10000);
		
		WebElement viewCv = driver.findElement(By.xpath("//body/div[@id='primary-search-account-menu']/div[3]/ul[1]/li[2]"));
		viewCv.click();
		Thread.sleep(10000);
		
		WebElement createCv = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/div[1]/div[2]/a[1]/button[1]"));
		createCv.click();
		Thread.sleep(10000);
		
		WebElement personalInformation = driver.findElement(By.xpath("//span[contains(text(),'Personal Information')]"));
		personalInformation.click();
		Thread.sleep(10000);
		
		WebElement saveContinue = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/button[1]"));
		saveContinue.click();
		Thread.sleep(10000);
		
		WebElement objective = driver.findElement(By.xpath("//span[contains(text(),'Objective')]]"));
		objective.click();
		Thread.sleep(10000);
		
		WebElement Save = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/div[1]/form[1]/div[2]/button[1]"));
		Save.click();
		Thread.sleep(10000);
		
		WebElement education = driver.findElement(By.xpath("//span[contains(text(),'Educations')]"));
		education.click();
		Thread.sleep(10000);
		
		WebElement Addmore = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[2]/button[1]"));
		Addmore.click();
		Thread.sleep(10000);

		
		WebElement workexperience = driver.findElement(By.xpath("//span[contains(text(),'Work Experience')]"));
		workexperience.click();
		Thread.sleep(10000);
				
	}
	}
	

