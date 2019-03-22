package frameworkTest.KeywordUtil;

import org.openqa.selenium.By;

import frameworkTest.DriverReaders.AllDrivers1;

public class KeywordUtil extends AllDrivers1{
	
	public void sendkeysFunction(By id,String s) {
		
		driver.findElement(id).sendKeys(s);

}
public void clickFunction(By id) {
		
		driver.findElement(id).click();

}

public void clearFunction(By id) {
	
	driver.findElement(id).clear();

}

public void threadSleep(int s) {
	try {
		Thread.sleep(s);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
