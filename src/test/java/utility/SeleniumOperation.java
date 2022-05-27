package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperation {
	
	public static ChromeDriver cmd=null;

	public static void browserLaunch(String key,String value)
	
	{
		String s1=key;
		String s2=value;
		System.setProperty(s1,s2);
		cmd=new ChromeDriver();
		cmd.manage().window().maximize();
		
	}

   public static void openApplication(String url)
	
	{
		String URL=url;
		cmd.navigate().to(URL);	
	}

	public static void clickOnElement(String xpath)
	{
        String XPATH=xpath;
		cmd.findElement(By.xpath(XPATH)).click();
		
		
	}
	public static void mouseOver(String xpath)
	{
		String XPATH=xpath;
		Actions act=new Actions(cmd);
        WebElement wb=(cmd.findElement(By.xpath(XPATH)));
        act.moveToElement(wb).build().perform();
	}
	public static void sendKeys(String xpath,String value)
	{
        String XPATH=xpath;
        String VAL=value;
        cmd.findElementByXPath(XPATH).sendKeys(VAL);
		
	}
	
	public static void main (String[]args) throws InterruptedException
	{
		SeleniumOperation.browserLaunch("webdriver.chrome.driver","E:\\Automation softwares\\chromedriver.exe");
		SeleniumOperation.openApplication("https://www.flipkart.com");
		cmd.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		SeleniumOperation.clickOnElement("//*[@class='_2KpZ6l _2doB4z']");
		SeleniumOperation.mouseOver("//*[text()='Login']");
		//Thread.sleep(7000);
		SeleniumOperation.clickOnElement("//*[text()='My Profile']");
		SeleniumOperation.sendKeys("//*[@class='_2IX_2- VJZDxU']", "dbdipty@gmail.com");
		SeleniumOperation.sendKeys("//*[@type='password']", "Dipti*123");
		SeleniumOperation.clickOnElement("(//*[text()='Login'])[3]");
		Thread.sleep(5000);
		SeleniumOperation.clickOnElement("//*[text()='Manage Addresses']");
		SeleniumOperation.clickOnElement("//*[text()='ADD A NEW ADDRESS']");
		SeleniumOperation.sendKeys("(//*[@type='text'])[2]","Dipti");
		SeleniumOperation.sendKeys("(//*[@type='text'])[3]","7709123820");
		SeleniumOperation.sendKeys("(//*[@type='text'])[4]","431005");
		SeleniumOperation.sendKeys("(//*[@type='text'])[5]","abad");
		SeleniumOperation.sendKeys("//*[@name='addressLine1']","Tapadiya Nagar");
		SeleniumOperation.sendKeys("//*[@name='addressLine2']","Kasliwal classic");
		SeleniumOperation.clickOnElement("//*[text()='Save']");
		
	}
	
	
}
