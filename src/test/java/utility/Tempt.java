package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tempt {
	
	
	
	public static void main (String[]args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Automation softwares\\chromedriver.exe");
		ChromeDriver cmd =new ChromeDriver();
		cmd.manage().window().maximize();
		
		//cmd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		cmd.navigate().to("https://www.flipkart.com");
		
		cmd.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
       
		Actions act=new Actions(cmd);
        WebElement wb=(cmd.findElement(By.xpath("//*[text()='Login']")));
        act.moveToElement(wb).build().perform();
       // cmd.findElement(By.xpath("//*[@class='_2dSUjN']")).click();
        
        cmd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        cmd.findElement(By.xpath("//*[text()='My Profile']")).click();
        cmd.findElementByXPath("//*[@class='_2IX_2- VJZDxU']").sendKeys("dbdipty@gmail.com");
        cmd.findElementByXPath("//*[@type='password']").sendKeys("Dipti*123");
        cmd.findElementByXPath("(//*[text()='Login'])[3]").click();
        Thread.sleep(5000);
        cmd.findElementByXPath("//*[text()='Manage Addresses']").click();
        cmd.findElementByXPath("//*[text()='ADD A NEW ADDRESS']").click();
        cmd.findElementByXPath("(//*[@type='text'])[2]").sendKeys("Dipti K");
        cmd.findElementByXPath("(//*[@type='text'])[3]").sendKeys("7709123820");
        cmd.findElementByXPath("(//*[@type='text'])[4]").sendKeys("431003");
        cmd.findElementByXPath("(//*[@type='text'])[5]").sendKeys("Aurangabad");
        cmd.findElementByXPath("//*[@name='addressLine1']").sendKeys("Tapadiya Nagar");
        cmd.findElementByXPath("//*[text()='Save']").click();
      
      //act.moveToElement(a).build().perform();
		//cmd.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("dbdipty@gmail.com");
		//cmd.findElement(By.xpath("//*[@type='password']")).sendKeys("Dipti*123");
		//cmd.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
		//WebDriverWait wait=new WebDriverWait(cmd,10);
		//wait.until(ExpectedConditions.elementToBeClickable(cmd.findElement(By.xpath("//*[text()='My Account']"))));
				//WebElement a=cmd.findElement(By.xpath("//*[text()='My Account']"));

		//act.moveToElement(a).build().perform();
		//act.doubleClick(a).build().perform();
	    //cmd.findElement(By.xpath("(//*[@class='zZ3yfL'])[1]")).click();
		
		
	}

}
