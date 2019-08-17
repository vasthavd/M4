package pagebean1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Payment {

		WebDriver driver;
		@FindBy(name="txtFN")
		@CacheLookup
		WebElement uname;
		
		@FindBy(name="debit" )
		@CacheLookup
		WebElement debit;
		
		@FindBy(name="cvv")
		@CacheLookup
		WebElement cvv;

		@FindBy(name="month")
		@CacheLookup
		WebElement month;
		
		@FindBy(name="year")
		@CacheLookup
		WebElement year;
		
		
		
		@FindBy(id ="btnPayment")
		@CacheLookup
		WebElement MakePayment;
		
	
		
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
		
		
		
		public WebElement getCVV() {
			return cvv;
		}
		public void setCVV(String CVV) {
			this.cvv.sendKeys(CVV);
		}
		public WebElement getExpMonth() {
			return month;
		}
		public void setExpMonth(String ExpMonth) {
			this.month.sendKeys(ExpMonth);
		}
		public WebElement getyear() {
			return year;
		}
		public void setyear(String year) {
			this.year.sendKeys(year);
		}
		public WebElement getdebit() {
			return debit;
		}
		public void setdebit(String debit) {
			this.debit.sendKeys(debit);
		}
		public WebElement getMakePayment() {
			return MakePayment;
		}
		public void setMakePayment() {
			this.MakePayment.click();
		}

		public Payment(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}


}
