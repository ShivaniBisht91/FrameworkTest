package frameworkTest.TestCases;

import org.testng.annotations.Test;

import frameworkTest.DriverReaders.AllDrivers1;
import frameworkTest.KeywordUtil.KeywordUtil;
import frameworkTest.ObjectRepo.ObjectRepo;

public class Login1 extends AllDrivers1 {
	
  @Test
  public void login() {
	  
		KeywordUtil key=new KeywordUtil();
		
		ObjectRepo objrep=new ObjectRepo();
	  	    
	    key.clickFunction(objrep.signIn);
	    key.sendkeysFunction(objrep.logEmail,"shivibisht91@gmail.com");
	    key.sendkeysFunction(objrep.logPass,"Shivi1991");
	    key.clickFunction(objrep.logsub);
  }
}
