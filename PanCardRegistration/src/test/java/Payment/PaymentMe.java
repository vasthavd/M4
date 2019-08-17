package Payment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pagebean1.Payment;

public class PaymentMe {
	WebDriver driver;
	private Payment payment;
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Spring-cg\\chromedriver_win32\\chromedriver.exe" );
		
		driver= new ChromeDriver();		
	}
	@Given("^User is on Personal Details Page$")
	public void user_is_on_Personal_Details_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		 driver.get("D:\\Spring-cg\\PanCardRegistration\\PaymentDetails.html");
		    payment=new Payment(driver);
	}

	@When("^User enters invalid card holder Name$")
	public void user_enters_invalid_card_holder_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		 payment.setUname("");
		    Thread.sleep(2000);
	}

	@Then("^The card holder Name  field is invalid$")
	public void the_card_holder_Name_field_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		payment.setMakePayment();
		String expected="* Please enter ApplicantName.";
		String actual=payment.getUserErrMsg1().getText();
		Assert.assertEquals(expected, actual);
	}

	@When("^User enters valid data in card holder Name field but invalid data in debit card number field$")
	public void user_enters_valid_data_in_card_holder_Name_field_but_invalid_data_in_debit_card_number_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		payment.setUname("Ramya");
	    payment.setdebit("");
	    Thread.sleep(2000);
	}

	@Then("^The debit number field is invalid$")
	public void the_debit_number_field_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		payment.setMakePayment();
		String expected="* Please enter ApplicantName.";
		String actual=payment.getUserErrMsg2().getText();
		Assert.assertEquals(expected, actual);
		
	}

	@When("^User enters valid data in card holder Name and debit card number field but invalid data in expiration date field$")
	public void user_enters_valid_data_in_card_holder_Name_and_debit_card_number_field_but_invalid_data_in_expiration_date_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		payment.setUname("Ramya");
	    payment.setdebit("92374623");
	    payment.setCVV("123");
	    payment.setExpMonth("");
	    Thread.sleep(2000);
	}

	@Then("^The expiration date field is invalid$")
	public void the_expiration_date_field_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		payment.setMakePayment();
		String expected="* Please enter ApplicantName.";
		String actual=payment.getUserErrMsg3().getText();
		Assert.assertEquals(expected, actual);
	}

	@When("^User enters valid data in card holder Name,debit card number and expiration month field but invalid data in expiration year field$")
	public void user_enters_valid_data_in_card_holder_Name_debit_card_number_and_expiration_month_field_but_invalid_data_in_expiration_year_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		payment.setUname("Ramya");
		payment.setdebit("92374623");
		payment.setCVV("123");
		payment.setExpMonth("06");
		payment.setyear("");
	    Thread.sleep(2000);
	}

	@Then("^The expiration year field is invalid$")
	public void the_expiration_year_field_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		payment.setMakePayment();
		String expected="* Please enter ApplicantName.";
		String actual=payment.getUserErrMsg4().getText();
		Assert.assertEquals(expected, actual);
	}

	@When("^User clicks  on Make Payment button with valid inputs$")
	public void user_clicks_on_Make_Payment_button_with_valid_inputs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		payment.setUname("Ramya");
		payment.setdebit("92374623");
		payment.setCVV("123");
		payment.setExpMonth("06");
		payment.setyear("2019");
	    Thread.sleep(2000);
	}

	@Then("^Redirected  to success Page$")
	public void redirected_to_success_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		 driver.get("D:\\Spring-cg\\PanCardRegistration\\Success.html");
		 payment.setMakePayment();
	}
}
