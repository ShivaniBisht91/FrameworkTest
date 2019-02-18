package frameworkTest.KeywordUtil;

import org.openqa.selenium.By;

import frameworkTest.DriverReaders.AllDrivers;

public class KeywordUtil extends AllDrivers{
	
	public void sendkeysFunction(By id,String s) {
		
		driver.findElement(id).sendKeys(s);

}
public void clickFunction(By id) {
		
		driver.findElement(id);

}
}
