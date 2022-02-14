package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import junit.framework.Assert;
import utilities.Utilities;

public class RetailPagePageObject extends Base {
	public RetailPagePageObject() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textToValildate;
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountButton;
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement loginButton1;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement userNameFiled;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordField;
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton2;
	@FindBy(xpath = "//a[@class='list-group-item'][text()='Logout']")
	private WebElement validateLogoutButton;
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerForAnAffiliateAccount;

	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement CompanyNameTextbox;

	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement websiteNameTextbox;

	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxIDtextbox;

	@FindBy(xpath = "//label[normalize-space()='Cheque']")
	private WebElement chequeRadioButton;

	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement ChequePayeeNameTextbox;

	@FindBy(xpath = "//input[@name='agree']")
	private WebElement agreeButtonChekBox;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageforAffiliateAcc;
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement clickonEditYourAffiliate;

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankRadiaoButton;
	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement bankNameBox;

	@FindBy(id = "input-bank-branch-number")
	private WebElement branchNumberBox;

	@FindBy(id = "input-bank-swift-code")
	private WebElement swiftCodeBox;
	@FindBy(id = "input-bank-account-name")
	private WebElement accountNameBox;

	@FindBy(id = "input-bank-account-number")
	private WebElement accountNumberBox;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement clickonContinue3;

	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement clickOnEditYourAccountLink;

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstNameFiled;
	@FindBy(id = "input-lastname")
	private WebElement lastNameField;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement emailIdFiled;
	@FindBy(xpath = "//input[@type='tel']")
	private WebElement telephoneField;

	public void validateHomePage() {
		String text = textToValildate.getText();
		if (text.equalsIgnoreCase("TEST ENVIRONMENT")) {
			logger.info("Text verified!");
		} else {
			logger.info("Text does not match!");
		}
	}

	public void clickOnMyAccountButton() {
		myAccountButton.click();
	}

	public void clickOnLoginButton1() {
		loginButton1.click();
	}

	public void enterUserName() {
		userNameFiled.sendKeys("Ajnolfjugas28r353488@gmail.com");
	}

	public void enterPassword() {
		passwordField.sendKeys("Aonodsrl333989");
	}

	public void enterUserNameWithParam(String username) {
		userNameFiled.sendKeys(username);
	}

	public void enterPasswordWithParam(String password) {
		passwordField.sendKeys(password);
	}

	public void clickOnLoginButton2() {
		loginButton2.click();
	}

	@SuppressWarnings("deprecation")
	public void validateLogoutButtonToVerifyWeAreLoggedIN() {

		String ActualValidateWeAreOnLogoutPage = validateLogoutButton.getText();
		String expectedLogouttext = "Logout";

		try {
			Assert.assertEquals(expectedLogouttext, ActualValidateWeAreOnLogoutPage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void RegisterForAnAffiliateAccount() {
		Utilities.waitAndClickElement(registerForAnAffiliateAccount);

	}

	public void CompanyName(String company) {

		CompanyNameTextbox.sendKeys(company);
	}

	public void websiteName(String website) {
		websiteNameTextbox.sendKeys(website);
	}

	public void taxIDtextbox(String taxID) {
		taxIDtextbox.sendKeys(taxID);
	}

	@SuppressWarnings("deprecation")
	public void varifyRadioButtonforChequeIsSelected() {
		boolean IschequeRadioButtonSelected = chequeRadioButton.isSelected();
		boolean actualBln = false;
		try {
			Assert.assertEquals(IschequeRadioButtonSelected, actualBln);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void ChequePayeeNameTextbox(String paymentMethod) {
		ChequePayeeNameTextbox.sendKeys(paymentMethod);
	}

	public void agreeButtonChekBox() {
		agreeButtonChekBox.click();

	}

	public void continueButton() {
		Utilities.waitAndClickElement(continueButton);
	}

	@SuppressWarnings("deprecation")
	public void verifysuccessMessageforAffiliateAcc() {
		String expectedSuccessMessage = "Success: Your account has been successfully updated.";
		String ActualSuccessMessage = successMessageforAffiliateAcc.getText();
		try {

			Assert.assertEquals(expectedSuccessMessage, ActualSuccessMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void clickonEditYourAffiliate() {
		Utilities.waitAndClickElement(clickonEditYourAffiliate);

	}

	public void verifyIsbankRadiaoButtonSelected() {
		Utilities.waitAndClickElement(bankRadiaoButton);
	}

	public void enterBankName(String bankName) {
		bankNameBox.sendKeys(bankName);
	}

	public void enterbranchNumber(String abaNumber) {
		branchNumberBox.sendKeys(abaNumber);
	}

	public void enterswiftCode(String swiftCode) {
		swiftCodeBox.sendKeys(swiftCode);
	}

	public void enteraccountName(String accountName) {
		accountNameBox.sendKeys(accountName);
	}

	public void enteraccountNumber(String accountNumber) {
		accountNumberBox.sendKeys(accountNumber);
	}

	public void clickonContinue3() {
		Utilities.waitAndClickElement(clickonContinue3);

	}

	@SuppressWarnings("deprecation")
	public void verifysuccessMessageforAffiliateAccEdited() {
		String expectedSuccessMessage = "Success: Your account has been successfully updated.";
		String ActualSuccessMessage = successMessageforAffiliateAcc.getText();
		try {

			Assert.assertEquals(expectedSuccessMessage, ActualSuccessMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void clickOnEditYourAccountInfoLink() {
		Utilities.waitAndClickElement(clickOnEditYourAccountLink);
		
	}
	
	public void enterfirstName(String firstname) {
		firstNameFiled.clear();
		firstNameFiled.sendKeys(firstname);
	}

	public void enterlastName(String lastName) {
		lastNameField.clear();
		lastNameField.sendKeys(lastName);
	}

	public void enteremailId(String email) {
		emailIdFiled.clear();
		emailIdFiled.sendKeys(email);
	}

	public void entertelephone(String telephone) {
		telephoneField.clear();
		telephoneField.sendKeys(telephone);
	}

}
