package frameworkTest.TestCases;

import frameworkTest.DriverReaders.AllDrivers;
import frameworkTest.KeywordUtil.KeywordUtil;
import frameworkTest.ObjectRepo.ObjectRepo;

public class Login extends AllDrivers{

	public static void main(String[] args) {
		
		AllDrivers brwsr=new AllDrivers();
		KeywordUtil key=new KeywordUtil();
		
		ObjectRepo objrep=new ObjectRepo();
	    brwsr.openChrome();
	    
	    key.clickFunction(objrep.signIn);
	    key.sendkeysFunction(objrep.logEmail,"shivibisht91@gmail.com");
	    key.sendkeysFunction(objrep.logPass,"Shivi1991");
	    key.clickFunction(objrep.logsub);

	}

}
