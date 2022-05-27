package cucumbermap;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperation1;

public class Login {
	
	
	@When ("^User launch \"(.*)\" browser with exe as$")
		
		public void bLaunch(String bname)
		{
		Object[] input=new Object[1];
		input[0]=bname;
		
		SeleniumOperation1.browserLaunch(input);
		}
	
	@When ("^User open URL as$")
	public void openApplication()
	{
		
		SeleniumOperation1.openApplication();
		
	}
		
	@When ("^User cancel initial Login window$")
	
	public void cancelLoginw()
	{
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperation1.clickOnElement(input2);  // cancel login
	}
	@When ("^User navigate on Login button$")
	public void navigateLogin() throws InterruptedException
	{
		Object[] input3=new Object[1];
		input3[0]="//*[text()='Login']";
		//cmd.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		Hashtable <String,Object>output3=SeleniumOperation1.mouseOver(input3);  // move to login
		//HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "^User navigate on Login button$", output3.get("MESSAGE").toString());
	Thread.sleep(5000);
	}
	
	@When ("^User click on MyProfile$")
	public void clickonMyProfile() throws InterruptedException
	{
		Thread.sleep(5000);
		Object[] input4=new Object[1];
		input4[0]="//*[text()='My Profile']";
		Hashtable <String,Object>output4=SeleniumOperation1.clickOnElement(input4);  // click on my profile
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^User click on MyProfile$", output4.get("MESSAGE").toString());
	}
	@When ("^User enter \"(.*)\" as username$")
	public void enterUname(String uname)
	   {
		Object[] input5=new Object[2];
		input5[0]="//*[@class='_2IX_2- VJZDxU']";
		input5[1]=uname;
		Hashtable <String,Object>output5=SeleniumOperation1.sendKeys(input5);  //enter id  
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^User enter \"(.*)\" as username$", output5.get("MESSAGE").toString());
		   
	   }
	   @When ("^User enter \"(.*)\" as password$")
	   public void enterPassword(String password)
	   {
		   Object[] input6=new Object[2];
			input6[0]="//*[@type='password']";
			input6[1]=password;
			Hashtable <String,Object>output6=SeleniumOperation1.sendKeys(input6);  // enter pwd
			HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^User enter \"(.*)\" as password$", output6.get("MESSAGE").toString());
	   }
	   @When ("^User click on Login button$")
	   public void clickOnLogin() throws InterruptedException
	   {
		    Object[] input7=new Object[1];
			input7[0]="(//*[text()='Login'])[3]";
			Hashtable <String,Object>output7=SeleniumOperation1.clickOnElement(input7);  // click on login
			HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^User click on Login button$", output7.get("MESSAGE").toString());
		   
	   }
	   
	   @Then ("^Application shows user profile to user$")
	   public void valid()
	   {
		   Object[] input8=new Object[2];
			input8[0]="//*[@class='_1ruvv2']";
			input8[1]="Dipti";
			Hashtable <String,Object>output8=SeleniumOperation1.validation(input8);  // enter pwd
			HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^Application shows user profile to user$", output8.get("MESSAGE").toString());
	   }
	   
	   @Then ("^Application shows appropriate error message to user$")
         public void inValid()
	   {
		   Object[] input9=new Object[2];
			input9[0]="(//*[text()='Login'])[2]";
			input9[1]="Login";
			Hashtable <String,Object>output9=SeleniumOperation1.validationForInvalid(input9);  // enter pwd
			HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "^Application shows appropriate error message to user$", output9.get("MESSAGE").toString());
	   }
	   
	   @When ("^User enters (.+) as username$")
	   
		   public void unameP(String given)
		   
		   {
		   Object[] input10=new Object[2];
			input10[0]="//*[@class='_2IX_2- VJZDxU']";
			input10[1]=given;
		    SeleniumOperation1.sendKeys(input10);  //enter id  
	   			  
		   }
	   	   
	   @When ("^User enters (.+) as password$")
	   public void pass(String given)
	   {
		   Object[] input11=new Object[2];
			input11[0]="//*[@type='password']";
			input11[1]=given;
		    SeleniumOperation1.sendKeys(input11);  //enter id  
	   }
	   
	   @Then ("^browser close$")
	   public void bClose()
	   {
		   SeleniumOperation1.browserClose();
	   }

	   }
