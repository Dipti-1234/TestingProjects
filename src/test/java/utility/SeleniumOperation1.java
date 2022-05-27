package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumbermap.ConfigReader;

public class SeleniumOperation1 {
	
	public static ConfigReader config=new ConfigReader();
	public static WebDriver cmd=null;
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>(); 
	
   
	public static Hashtable<String,Object> browserLaunch(Object [] inputParameters)
	{
		
    	try
    	{
		String bname=(String) inputParameters[0];
		
		if(bname.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",config.getDriverPathChrome());
			cmd=new ChromeDriver();
			cmd.manage().window().maximize();
			cmd.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		}
		else if(bname.equalsIgnoreCase("FF"))
		{
			//cmd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			System.setProperty("webdriver.geckodriver.driver",config.getDriverPathFF());
			cmd=new FirefoxDriver();
			cmd.manage().window().maximize();
			
		}
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Methodused:browserLaunch,Inputgiven: "+inputParameters[0].toString());
		
		}
    	catch (Exception e)
    	{
    		outputParameters.put("STATUS", "FAIL");
    		outputParameters.put("MESSAGE", "Methodused:browserLaunch,Inputgiven: "+inputParameters[0].toString());
    	}
    	return outputParameters;
	}
    public static Hashtable<String,Object> openApplication()
    {
    	try
    	{
    	
	
	
	cmd.navigate().to(config.getApplicationUrl());
	//cmd.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "Methodused:openApplication,Inputgiven: "+config.getApplicationUrl().toString());

    	}
    	catch (Exception e)
    	{
    		outputParameters.put("STATUS", "FAIL");
   		outputParameters.put("MESSAGE", "Methodused:openApplication,Inputgiven: "+ config.getApplicationUrl().toString());

    	}
    	
    	return outputParameters;

    }
    public static Hashtable<String,Object> clickOnElement(Object[] inputParameters)
    {
    	try
    	{
    	//cmd.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
    	String XPATH=(String) inputParameters[0];
	cmd.findElement(By.xpath(XPATH)).click();
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "Methodused:clickOnElement,Inputgiven: "+inputParameters[0].toString());

    	}
    	catch (Exception e)
    	{
    		outputParameters.put("STATUS", "FAIL");
    		outputParameters.put("MESSAGE", "Methodused:clickOnElement,Inputgiven: "+inputParameters[0].toString());
    	}
    	
    	return outputParameters;

    }
    
    public static Hashtable<String,Object> mouseOver(Object[] inputParameters)
	{
    	try
    	{
    	//cmd.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
    	String XPATH=(String) inputParameters[0];
		Actions act=new Actions(cmd);
        WebElement wb=(cmd.findElement(By.xpath(XPATH)));
        act.moveToElement(wb).build().perform();
        outputParameters.put("STATUS", "PASS");
    	outputParameters.put("MESSAGE", "Methodused:mouseOver,Inputgiven: "+inputParameters[0].toString());
    	}
    	catch (Exception e)
    	{
    		outputParameters.put("STATUS", "FAIL");
    		outputParameters.put("MESSAGE", "Methodused:mouseOver,Inputgiven: "+inputParameters[0].toString());
    	}
    	return outputParameters;


	}
	public static Hashtable<String,Object> sendKeys(Object[] inputParameters)
	{ 
		try
		{
		//cmd.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		String XPATH=(String) inputParameters[0];
        String VAL=(String) inputParameters[1];    	
        cmd.findElement(By.xpath(XPATH)).sendKeys(VAL);
        outputParameters.put("STATUS", "PASS");
    	outputParameters.put("MESSAGE", "Methodused:sendKeys,Inputgiven: "+inputParameters[1].toString());
		}
    	catch (Exception e)
    	{
    		 outputParameters.put("STATUS", "FAIL");
    	    	outputParameters.put("MESSAGE", "Methodused:sendKeys,Inputgiven: "+inputParameters[1].toString());
    	}
    	return outputParameters;


	}
	public static Hashtable<String,Object> validation(Object [] inputParameters)
	{
		try
		{
		//cmd.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		String XPATH=(String) inputParameters[0]; //name on screen xpath
		String text=(String) inputParameters[1]; // name on screen
		String actualText=cmd.findElement(By.xpath(XPATH)).getText(); //name
		if (actualText.equalsIgnoreCase(text))
				{
			System.out.println("Testcase pass");
			
				}
		else
			
		{
			System.out.println("Testcase fail");
		}

		 outputParameters.put("STATUS", "PASS");
	    outputParameters.put("MESSAGE", "Methodused:validation,Inputgiven: "+inputParameters[1].toString());
		}
    	catch (Exception e)
    	{
    		 outputParameters.put("STATUS", "FAIL");
    		    outputParameters.put("MESSAGE", "Methodused:validation,Inputgiven: "+inputParameters[1].toString());
    	}
    	
    	return outputParameters;

	}
	
	public static Hashtable<String,Object> validationForInvalid(Object[]inputParameters)
	{
		try
		{
		//cmd.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		String XPATH=(String) inputParameters[0]; //name on screen xpath
		String text=(String) inputParameters[1]; // name on screen
		String actualText=cmd.findElement(By.xpath(XPATH)).getText(); //name
		if (actualText.equalsIgnoreCase(text))
				{
			System.out.println("Testcase pass");
			
				}
		else
			
		{
			System.out.println("Testcase fail");
			
		}
	//outputParameters.put("STATUS", "PASS");
		//  outputParameters.put("MESSAGE", "Methodused:validationForInvalid,Inputgiven: "+inputParameters[1].toString());
		}
    	catch (Exception e)
    	{
    //outputParameters.put("STATUS", "FAIL");
 		//  outputParameters.put("MESSAGE", "Methodused:validationForInvalid,Inputgiven: "+inputParameters[1].toString());
    	}
    	
    	return outputParameters;

	}
	public static void browserClose()
	{
		cmd.close();
    
		
	}
}
  