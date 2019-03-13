package frameworkTest.ObjectRepo;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;

import frameworkTest.DriverReaders.AllDrivers1;

public class ObjectRepo extends AllDrivers1 {
	
	//Register page
	public By email_id=By.id("email_create");
	public By sub=By.id("SubmitCreate");
	public By mrs=By.id("id_gender2");
	public By fname=By.id("customer_firstname");
	public By lname=By.id("customer_lastname");
	public By pass=By.id("passwd");
	public By address=By.id("address1");
	public By city=By.id("city");
	public By state=By.id("id_state");
	public By postcode=By.id("postcode");
	public By country=By.id("id_country");
	public By mobile=By.id("phone_mobile");
	public By alias=By.id("alias");
	public By subAccount=By.id("submitAccount");
	//public WebElement item = driver.findElement(By.xpath("//li[text()='An account using this email address has already been registered. Please enter a valid password or request a new one. ']"));
	
	
	//login page
	
	public By signIn=By.xpath("//a[@title='Log in to your customer account']");
	public By logEmail=By.id("email");
	public By logPass=By.id("passwd");
	public By logsub=By.id("SubmitLogin");
	public By signout=By.xpath("//a[@title='Log me out']");
	
	//Home page
	
	public By search=By.id("search_query_top");
	public By go=By.name("submit_search");
	//public By itemClick=By.xpath("(//*[text()='Quick view'])[1]");
	public By item=By.xpath("(//a[@class='product-name'])[9]");
	public By cartbtn=By.xpath("//span[text()='Add to cart']");
	public By proceed=By.xpath("//a[@title='Proceed to checkout']");
	


}
