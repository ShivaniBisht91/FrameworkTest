package frameworkTest.TestCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import frameworkTest.DriverReaders.AllDrivers1;
import frameworkTest.KeywordUtil.KeywordUtil;
import frameworkTest.ObjectRepo.ObjectRepo;

public class RegisterNew1 extends AllDrivers1 {
	

  @Test
  public void RegisterNewUser() {
	  
		KeywordUtil key=new KeywordUtil();
		
		ObjectRepo objrep=new ObjectRepo();
		
	    key.sendkeysFunction(objrep.email_id,"shivibisht91@gmail.com");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    key.clickFunction(objrep.sub);
	   
	   WebDriverWait wait= new WebDriverWait(driver,60);
	    
	WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(objrep.mrs));
	if(element.isDisplayed()) {
		
		key.clickFunction(objrep.mrs);
		}
	    key.sendkeysFunction(objrep.fname, "Shivani");
	    key.sendkeysFunction(objrep.lname, "Bisht");
	    key.sendkeysFunction(objrep.pass, "Shivi1991");
	    key.sendkeysFunction(objrep.address, "1234,chd");	
	    key.sendkeysFunction(objrep.city, "Chandigarh");	
		
		WebElement state=driver.findElement(objrep.state);
		
		Select drop=new Select(state);
		drop.selectByValue("32");
		
		key.sendkeysFunction(objrep.postcode, "12345");	
		
		WebElement country=driver.findElement(objrep.country);
		Select drop1=new Select(country);
		
		if(!country.isSelected()) {
			
			drop1.selectByValue("21");
			
		}
		
		key.sendkeysFunction(objrep.mobile, "9998787878");
		key.sendkeysFunction(objrep.alias, "hello again");
		key.clickFunction(objrep.subAccount);
		
		//WebElement name=driver.findElement(By.xpath("//*[@id=\"header\"]//div//a//span[contains(text(),'Shivani Bisht')]"));
		
  }
}
