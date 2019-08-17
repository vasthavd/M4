package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageBean.Register;

public class LoginStepDefinition {
	WebDriver driver;
	private Register register;
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Spring-cg\\chromedriver_win32\\chromedriver.exe" );
		
		driver= new ChromeDriver();		
	}

    @Given("^User is on User Information Page$")
public void user_is_on_User_Information_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
	 driver.get("D:\\Spring-cg\\PanCardRegistration\\UserInformation.html");
	    register=new Register(driver);

}

@When("^User enters invalid Applicant Name$")
public void user_enters_invalid_Applicant_Name() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
	 register.setUname("");
	    Thread.sleep(2000);
}

@Then("^The Applicant Name  field is invalid$")
public void the_Applicant_Name_field_is_invalid() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	register.setSubmit();
	String expected="* Please enter ApplicantName.";
	String actual=register.getUserErrMsg1().getText();
	Assert.assertEquals(expected, actual);
}

@When("^User enters valid data in Applicant Name field but invalid data in First Name field$")
public void user_enters_valid_data_in_Applicant_Name_field_but_invalid_data_in_First_Name_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	 register.setUname("Ramya");
	    register.setFirstName("");
	    Thread.sleep(2000);
}

@Then("^The First Name field is invalid$")
public void the_First_Name_field_is_invalid() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	register.setSubmit();
	String expected="* Please enter FirstName.";
	String actual=register.getUserErrMsg2().getText();
	Assert.assertEquals(expected, actual);
}

@When("^User enters valid data in Applicant Name and First Name field but invalid data in Last Name field$")
public void user_enters_valid_data_in_Applicant_Name_and_First_Name_field_but_invalid_data_in_Last_Name_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	register.setUname("Ramya");
    register.setFirstName("Ramya");
    register.setLastName("");
    register.setSubmit();
    Thread.sleep(2000);
}

@Then("^The Last Name field is invalid$")
public void the_Last_Name_field_is_invalid() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	register.setSubmit();
	String expected="* Please enter LastName.";
	String actual=register.getUserErrMsg3().getText();
	Assert.assertEquals(expected, actual);
}

@When("^User enters valid data in Applicant Name,First Name and Last Name field but invalid data in Father Name field$")
public void user_enters_valid_data_in_Applicant_Name_First_Name_and_Last_Name_field_but_invalid_data_in_Father_Name_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	register.setUname("Ramya");
    register.setFirstName("Ramya");
    register.setLastName("Aithabattula");
    register.setFatherName("");
    Thread.sleep(2000);
}

@Then("^The Father Name field is invalid$")
public void the_Father_Name_field_is_invalid() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	register.setSubmit();
	String expected="* Please enter FatherName.";
	String actual=register.getUserErrMsg4().getText();
	Assert.assertEquals(expected, actual);
}

@When("^User enters valid data in Applicant Name,First Name,Last Name and Father Name field but invalid data in Date of Birth field$")
public void user_enters_valid_data_in_Applicant_Name_First_Name_Last_Name_and_Father_Name_field_but_invalid_data_in_Date_of_Birth_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    ///throw new PendingException();
	register.setUname("Ramya");
    register.setFirstName("Ramya");
    register.setLastName("Aithabattula");
    register.setFatherName("Janaki Ramayya");
    register.setDOB("");
    Thread.sleep(2000);
}

@Then("^The Date Of Birth field invalid$")
public void the_Date_Of_Birth_field_invalid() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	register.setSubmit();
	String expected="* Please enter DateOfBirth.";
	String actual=register.getUserErrMsg5().getText();
	Assert.assertEquals(expected, actual);
}

@When("^User selects Male radiobutton$")
public void user_selects_Male_radiobutton() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	register.setUname("Ramya");
    register.setFirstName("Ramya");
    register.setLastName("Aithabattula");
    register.setFatherName("Janaki Ramayya");
    register.setDOB("10051998");
    register.setMale();
    Thread.sleep(2000);
}

@Then("^Male should be send as Gender val$")
public void male_should_be_send_as_Gender_val() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^User selects Female radiobutton$")
public void user_selects_Female_radiobutton() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	register.setUname("Ramya");
    register.setFirstName("Ramya");
    register.setLastName("Aithabattula");
    register.setFatherName("Janaki Ramayya");
    register.setDOB("10051998");
    register.setFemale();
    Thread.sleep(2000);
}

@Then("^Female should be send as Gender val$")
public void female_should_be_send_as_Gender_val() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^User enters valid data in User Name,Last Name,Father Name,Date of birth field but invalid data in Phone field$")
public void user_enters_valid_data_in_User_Name_Last_Name_Father_Name_Date_of_birth_field_but_invalid_data_in_Phone_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	register.setUname("Ramya");
    register.setFirstName("Ramya");
    register.setLastName("Aithabattula");
    register.setFatherName("Janaki Ramayya");
    register.setDOB("10051998");
    register.setFemale();
    register.setPhone("");
    Thread.sleep(2000);
}

@Then("^The Phone no field is invalid$")
public void the_Phone_no_field_is_invalid() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	register.setSubmit();
	String expected="* Please enter 10 digit phone no.";
	String actual=register.getUserErrMsg6().getText();
	Assert.assertEquals(expected, actual);
}

@When("^User enters valid data in User Name,Last Name,FatherName,Date of birth and Phone field but invalid data in Email Id field$")
public void user_enters_valid_data_in_User_Name_Last_Name_FatherName_Date_of_birth_and_Phone_field_but_invalid_data_in_Email_Id_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	register.setUname("Ramya");
    register.setFirstName("Ramya");
    register.setLastName("Aithabattula");
    register.setFatherName("Janaki Ramayya");
    register.setDOB("10051998");
    register.setFemale();
    register.setPhone("9848290292");
    register.setEmail("");
    Thread.sleep(2000);
}

@Then("^The Email Id field is invalid$")
public void the_Email_Id_field_is_invalid() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	register.setSubmit();
	String expected="* Please enter MailId.";
	String actual=register.getUserErrMsg7().getText();
	Assert.assertEquals(expected, actual);
}

@When("^User enters valid data in User Name,Last Name,Father Name,Date of birth,Email Id and Phone field but invalid data in Phone field$")
public void user_enters_valid_data_in_User_Name_Last_Name_Father_Name_Date_of_birth_Email_Id_and_Phone_field_but_invalid_data_in_Phone_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	register.setUname("Ramya");
    register.setFirstName("Ramya");
    register.setLastName("Aithabattula");
    register.setFatherName("Janaki Ramayya");
    register.setDOB("10051998");
    register.setFemale();
    register.setPhone("9848290292");
    register.setEmail("r@gmail.com");
    register.setLandline("");
    
    Thread.sleep(2000);
}

@Then("^The Landline no field is invalid$")
public void the_Landline_no_field_is_invalid() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	register.setSubmit();
	String expected="* Please enter Landline.";
	String actual=register.getUserErrMsg8().getText();
	Assert.assertEquals(expected, actual);
}

@When("^User selects Residence radiobutton$")
public void user_selects_Residence_radiobutton() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	register.setUname("Ramya");
    register.setFirstName("Ramya");
    register.setLastName("Aithabattula");
    register.setFatherName("Janaki Ramayya");
    register.setDOB("10051998");
    register.setFemale();
    register.setPhone("9848290292");
    register.setEmail("r@gmail.com");
    register.setLandline("9876543210");
    register.setResidence();
    Thread.sleep(2000);
}

@Then("^Residence should be send as Communication val$")
public void residence_should_be_send_as_Communication_val() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^User selects Office radiobutton$")
public void user_selects_Office_radiobutton() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	register.setUname("Ramya");
    register.setFirstName("Ramya");
    register.setLastName("Aithabattula");
    register.setFatherName("Janaki Ramayya");
    register.setDOB("10051998");
    register.setFemale();
    register.setPhone("9848290292");
    register.setEmail("r@gmail.com");
    register.setLandline("9876543210");
    register.setOffice();
    Thread.sleep(2000);
}

@Then("^Office should be send as Communication val$")
public void office_should_be_send_as_Communication_val() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^User enters valid data in User Name,Last Name,FatherName,Date of birth,Phone and Email Id field but invalid data in Address field$")
public void user_enters_valid_data_in_User_Name_Last_Name_FatherName_Date_of_birth_Phone_and_Email_Id_field_but_invalid_data_in_Address_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	register.setUname("Ramya");
    register.setFirstName("Ramya");
    register.setLastName("Aithabattula");
    register.setFatherName("Janaki Ramayya");
    register.setDOB("10051998");
    register.setFemale();
    register.setPhone("9848290292");
    register.setEmail("r@gmail.com");
    register.setLandline("9876543210");
    register.setOffice();
    register.setAddress("");
    Thread.sleep(2000);
}

@Then("^The Address field is invalid$")
public void the_Address_field_is_invalid() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
	register.setSubmit();
	//String expected="* Please enter Address.";
	//String actual=register.getUserErrMsg9().getText();
	//Assert.assertEquals(expected, actual);
}

@When("^User clicks  on Submit button with valid inputs$")
public void user_clicks_on_Submit_button_with_valid_inputs() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	register.setUname("Ramya");
    register.setFirstName("Ramya");
    register.setLastName("Aithabattula");
    register.setFatherName("Janaki Ramayya");
    register.setDOB("10051998");
    register.setFemale();
    register.setPhone("9848290292");
    register.setEmail("r@gmail.com");
    register.setLandline("9876543210");
    register.setOffice();
    register.setAddress("Rajahmuundry");
    Thread.sleep(2000);
}

@Then("^Redirected  to Success Page$")
public void redirected_to_Success_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	 driver.get("D:\\Spring-cg\\PanCardRegistration\\PaymentDetails.html");
	 register.setSubmit();
	 
}
@When("^User clicks  on Reset button$")
public void user_clicks_on_Reset_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	 register.setReset();
}

@Then("^All fields in forms should be blank$")
public void all_fields_in_forms_should_be_blank() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	register.setUname("");
    register.setFirstName("");
    register.setLastName("");
    register.setFatherName("");
    register.setDOB("");
    register.setFemale();
    register.setPhone("");
    register.setEmail("");
    register.setLandline("");
    register.setOffice();
    register.setAddress("");
    Thread.sleep(2000);
}

}