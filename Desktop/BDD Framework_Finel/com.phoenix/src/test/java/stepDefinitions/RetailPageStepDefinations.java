package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageObjects.RetailPagePageObject;
import utilities.Utilities;

public class RetailPageStepDefinations extends Base {

	RetailPagePageObject RetailPage = new RetailPagePageObject();

	@Given("^User is on Retail website$")
	public void User_is_on_Retail_website() throws IOException {
		RetailPage.validateHomePage();
		Utilities.takeScreenShot("RetailPage");
	}

	@And("User click  on MyAccount")
	public void user_click_on_my_account() {
		RetailPage.clickOnMyAccountButton();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		logger.info("clicked on my account button");
	}

	@When("User click on Login")
	public void user_click_on_login() {
		RetailPage.clickOnLoginButton1();
		logger.info("clicked on login Button successfully");
	}

	@And("User enter username ‘username’ and password 'password’")
	public void user_enter_username_user_name_and_password_password() {
		RetailPage.enterUserName();
		RetailPage.enterPassword();
		logger.info("entered username and passward successfully");
		
	}

	@And("User click on Login button")
	public void user_click_on_login_button() {
		RetailPage.clickOnLoginButton2();
		logger.info("clicked on login2 successfully");
	}

	@And("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() throws IOException {
		RetailPage.validateLogoutButtonToVerifyWeAreLoggedIN();
		logger.info("verified we are logged in");
		Utilities.takeScreenShot("logged in page");
	}

	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		RetailPage.RegisterForAnAffiliateAccount();

	}

	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String, String>> editAffilate = dataTable.asMaps(String.class, String.class);
		RetailPage.CompanyName(editAffilate.get(0).get("company"));
		RetailPage.websiteName(editAffilate.get(0).get("website"));
		RetailPage.taxIDtextbox(editAffilate.get(0).get("taxID"));
		RetailPage.varifyRadioButtonforChequeIsSelected();
		RetailPage.ChequePayeeNameTextbox(editAffilate.get(0).get("paymentMethod"));

	}

	@And("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		RetailPage.agreeButtonChekBox();
	}

	@And("User click on Continue button")
	public void user_click_on_continue_button() {
		RetailPage.continueButton();
		logger.info("clicked on continue button");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() throws IOException {
		RetailPage.verifysuccessMessageforAffiliateAcc();
		logger.info("the success message is displayed");
		Utilities.takeScreenShot("RetailPage");
	}

	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
		RetailPage.clickonEditYourAffiliate();
		logger.info("clicked on eith affiliate");
	}

	@And("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		RetailPage.verifyIsbankRadiaoButtonSelected();

	}

	@And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> editPaymentMethod = dataTable.asMaps(String.class, String.class);
		RetailPage.enterBankName(editPaymentMethod.get(0).get("bankName"));
		RetailPage.enterbranchNumber(editPaymentMethod.get(0).get("abaNumber"));
		RetailPage.enterswiftCode(editPaymentMethod.get(0).get("swiftCode"));
		RetailPage.enteraccountName(editPaymentMethod.get(0).get("accountName"));
		RetailPage.enteraccountNumber(editPaymentMethod.get(0).get("accountNumber"));

	}

	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
		RetailPage.clickOnEditYourAccountInfoLink();
	}

	@And("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> modifyAccountInfo = dataTable.asMaps(String.class, String.class);
		RetailPage.enterfirstName(modifyAccountInfo.get(0).get("firstname"));
		RetailPage.enterlastName(modifyAccountInfo.get(0).get("lastName"));
		RetailPage.enteremailId(modifyAccountInfo.get(0).get("email"));
		RetailPage.entertelephone(modifyAccountInfo.get(0).get("telephone"));
		logger.info("account modified");
	} 

	@And("User click on continue button")
	public void user_click_on_continue_button1() {
		RetailPage.clickonContinue3();
	}

	@Then("User should see a message ‘Success: Your account has been successfully updated.’")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() throws IOException {
		RetailPage.verifysuccessMessageforAffiliateAcc();
		logger.info("affiliate Account has been updated");
		Utilities.takeScreenShot("RetailPage");
	}

}
