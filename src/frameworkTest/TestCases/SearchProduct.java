package frameworkTest.TestCases;


import org.testng.annotations.Test;

import frameworkTest.DriverReaders.AllDrivers1;
import frameworkTest.KeywordUtil.KeywordUtil;
import frameworkTest.ObjectRepo.ObjectRepo;
import frameworkTest.commonScriptsUtil.Login;

public class SearchProduct extends AllDrivers1{
  @Test
  public void searchByValue() {
	 
	  KeywordUtil key=new KeywordUtil();
		
		ObjectRepo objrep=new ObjectRepo();
		
		//login	
		
		Login lg=new Login();
		lg.login();
		
	    //Search
		key.sendkeysFunction(objrep.search, "Dress");
		key.clickFunction(objrep.go);
		
		key.threadSleep(1000);
		
	    key.clickFunction(objrep.item);
	    key.threadSleep(4000);
	    key.clickFunction(objrep.cartbtn);
	    
	   key.threadSleep(4000);
	   key.clickFunction(objrep.proceed);
	    
	   
	    
	    
  }
}
