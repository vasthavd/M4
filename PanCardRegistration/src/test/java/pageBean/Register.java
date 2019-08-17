package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	WebDriver driver;
	@FindBy(name="txtNM")
	@CacheLookup
	WebElement uname;
	
	@FindBy(name="rdbML")
	@CacheLookup
	WebElement male;
	
	@FindBy(name="txtDOB")
	@CacheLookup
	WebElement DOB;
	
	@FindBy(name="rdbFML")
	@CacheLookup
	WebElement female;
	
	@FindBy(name="rdbRAddress")
	@CacheLookup
	WebElement Residence;

	@FindBy(name="rdbOffAddress")
	@CacheLookup
	WebElement Office;
	@FindBy(name="txtFName")
	@CacheLookup
	WebElement firstName;
	
	
	@FindBy(name="txtLName")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(name="txtFtName")
	@CacheLookup
	WebElement FatherName;
	@FindBy(name="txtEmailID")
	@CacheLookup
	WebElement email;
	
	@FindBy(name="resAddress")
	@CacheLookup
	WebElement address;
	
	@FindBy(name="txtMNo")
	@CacheLookup
	WebElement phone;
	
	@FindBy(name="txtLLine")
	@CacheLookup
	WebElement Landline;
	@FindBy(name = "submit")
	@CacheLookup
	WebElement submit;
	
	@FindBy(name = "reset")
	@CacheLookup
	WebElement reset;
	
	@FindBy(id="userErrMsg1")
	WebElement userErrMsg1;
	
	@FindBy(id="userErrMsg2")
	WebElement userErrMsg2;
	
	@FindBy(id="userErrMsg3")
	WebElement userErrMsg3;
	
	@FindBy(id="userErrMsg4")
	WebElement userErrMsg4;
	
	@FindBy(id="userErrMsg5")
	WebElement userErrMsg5;
	
	@FindBy(id="userErrMsg6")
	WebElement userErrMsg6;
	
	@FindBy(id="userErrMsg7")
	WebElement userErrMsg7;
	
	@FindBy(id="userErrMsg8")
	WebElement userErrMsg8;
	
	@FindBy(id="userErrMsg9")
	WebElement userErrMsg9;
	
	public WebElement getMale() {
		return male;
	}
	public void setMale() {
		this.male.click();;
	}
	public WebElement getFemale() {
		return female;
	}
	public void setFemale() {
		this.female.click();
	}
	public WebElement getResidence() {
		return Residence;
	}
	public void setResidence() {
		this.Residence.click();;
	}
	public WebElement getOffice() {
		return Office;
	}
	public void setOffice() {
		this.Office.click();
	}

	public WebElement getUserErrMsg1() {
		System.out.println(userErrMsg1.getText());
		return userErrMsg1;
	}
	public void setUserErrMsg1(WebElement userErrMsg1) {
		this.userErrMsg1 = userErrMsg1;
	}
	public WebElement getUserErrMsg2() {
		return userErrMsg2;
	}
	public void setUserErrMsg2(WebElement userErrMsg2) {
		this.userErrMsg2 = userErrMsg2;
	}
	public WebElement getUserErrMsg3() {
		return userErrMsg3;
	}
	public void setUserErrMsg3(WebElement userErrMsg3) {
		this.userErrMsg3 = userErrMsg3;
	}
	public WebElement getUserErrMsg4() {
		return userErrMsg4;
	}
	public void setUserErrMsg4(WebElement userErrMsg4) {
		this.userErrMsg4 = userErrMsg4;
	}
	public WebElement getUserErrMsg5() {
		return userErrMsg5;
	}
	public void setUserErrMsg5(WebElement userErrMsg5) {
		this.userErrMsg5 = userErrMsg5;
	}
	public WebElement getUserErrMsg6() {
		return userErrMsg6;
	}
	public void setUserErrMsg6(WebElement userErrMsg6) {
		this.userErrMsg6 = userErrMsg6;
	}
	public WebElement getUserErrMsg7() {
		return userErrMsg7;
	}
	public void setUserErrMsg7(WebElement userErrMsg7) {
		this.userErrMsg7 = userErrMsg7;
	}
	public WebElement getUserErrMsg8() {
		return userErrMsg8;
	}
	public void setUserErrMsg8(WebElement userErrMsg8) {
		this.userErrMsg8 = userErrMsg8;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname.sendKeys(uname);
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}
	public WebElement getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}
	public WebElement getFatherName() {
		return FatherName;
	}
	public void setFatherName(String FatherName) {
		this.FatherName.sendKeys(FatherName);
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	public WebElement getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address.sendKeys(address);
	}
	public WebElement getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone.sendKeys(phone);
	}
	public WebElement getLandline() {
		return Landline;
	}
	public void setLandline(String Landline) {
		this.Landline.sendKeys(Landline);
	}
	public WebElement getSubmit() {
		return submit;
	}
	public void setSubmit() {
		this.submit.click();
	}
	public WebElement getReset() {
		return reset;
	}
	public void setReset() {
		this.reset.click();
	}
	public WebElement getDOB() {
		return DOB;
	}
	public void setDOB(String DOB) {
		this.DOB.sendKeys(DOB);
	}

	public Register(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
