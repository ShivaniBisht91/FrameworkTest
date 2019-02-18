package frameworkTest.DriverReaders;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllDrivers {
	
	public static WebDriver driver;
	Properties pro;
	FileInputStream fis;

	public void openChrome() {
		
    File src=new File("H:\\Eclipse Workspace\\FrameworkTest\\src\\frameworkTest\\Configuration\\Config.properties");
		
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		pro=new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		String chropath=pro.getProperty("ChromeDriver");
		System.out.println(chropath);
		System.out.println("Launching chrome....");
		System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir")+chropath);
		driver= new ChromeDriver();
		driver.get(pro.getProperty("URL"));
		driver.manage().window().maximize();
		
	}
	
public void openFirefox() {
	
	 File src=new File("H:\\Eclipse Workspace\\FrameworkTest\\src\\frameworkTest\\Configuration\\Config.properties");
		
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		pro=new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		String firepath=pro.getProperty("FireFoxDriver");
		System.out.println(firepath);
		System.out.println("Launching chrome....");
		System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir")+firepath);
		driver= new ChromeDriver();
		driver.get(pro.getProperty("URL"));
		driver.manage().window().maximize();
		
	}

public void openIE() {
	 File src=new File("./Configuration/Config.properties");
		
		try {
			fis = new FileInputStream(src);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		pro=new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		String iepath=pro.getProperty("IEDriver");
		System.out.println(iepath);
		System.out.println("Launching chrome....");
		System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir")+iepath);
		driver= new ChromeDriver();
		driver.get(pro.getProperty("URL"));
		driver.manage().window().maximize();
	
}

public void openSafari() {
	
	File src=new File("./Configuration/Config.properties");
	
	try {
		fis = new FileInputStream(src);
	} catch (FileNotFoundException e) {
	
		e.printStackTrace();
	}
	pro=new Properties();
	try {
		pro.load(fis);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	String operapath=pro.getProperty("OperaDriver");
	System.out.println(operapath);
	System.out.println("Launching chrome....");
	System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dir")+operapath);
	driver= new ChromeDriver();
	driver.get(pro.getProperty("URL"));
	driver.manage().window().maximize();
}
	/*
	public static void main(String[] args) {
		

	} */

}
