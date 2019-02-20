package frameworkTest.ObjectRepo;

import org.openqa.selenium.By;

public class ObjectRepo {
	
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
	
	//login page
	
	public By signIn=By.xpath("//a[@title='Log in to your customer account']");
	public By logEmail=By.id("email");
	public By logPass=By.id("passwd");
	public By logsub=By.id("SubmitLogin");
	public By signout=By.xpath("//a[@title='Log me out']");

}
