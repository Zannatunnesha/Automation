import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FirstWebAutomation extends BaseDriver{

	@Test (priority = 0)
	
	public void openUrl() {
		driver.get(baseurl);
	try{
		Thread.sleep(10000);
	}catch(Exception e) {
	}}
	@Test (priority = 1)
	public void login() throws InterruptedException {
WebElement loginText = driver.findElement(By.xpath("//header/div[1]/div[2]/a[1]/button[1]"));
loginText.click();
Thread.sleep(10000);
	}
	}
