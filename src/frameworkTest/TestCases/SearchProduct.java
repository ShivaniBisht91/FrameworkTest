package frameworkTest.TestCases;

import org.testng.annotations.Test;

import frameworkTest.DriverReaders.AllDrivers1;
import frameworkTest.KeywordUtil.KeywordUtil;
import frameworkTest.ObjectRepo.ObjectRepo;

public class SearchProduct extends AllDrivers1{
  @Test
  public void searchByValue() {
	 
	  KeywordUtil key=new KeywordUtil();
		
		ObjectRepo objrep=new ObjectRepo();
		
		//login		
		key.clickFunction(objrep.signIn);
	    key.sendkeysFunction(objrep.logEmail,"shivibisht91@gmail.com");
	    key.sendkeysFunction(objrep.logPass,"Shivi1991");
	    key.clickFunction(objrep.logsub);
		
	    //Search
		key.sendkeysFunction(objrep.search, "Dress");
		key.clickFunction(objrep.go);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		key.clickFunction(objrep.itemClick);
	  
  }
}
