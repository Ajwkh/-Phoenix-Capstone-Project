package stepDefinitions;
import java.io.IOException;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DestopsPageObject;
import utilities.Utilities;

public class DesktopsPageSteps extends Base {

	DestopsPageObject desktops = new DestopsPageObject();
	
	@Given("User is on Retail Website")
	public void user_is_on_retail_website() throws IOException{
		desktops.user_is_on_retail_website();
		logger.info("validetd we are on home padge");
		Utilities.takeScreenShot("Homepage");
	}


	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
	   desktops.UserclickonDesktopstab();
	   logger.info("user clicked on desktopsTab");
	}

	@And("User click on show all desktops")
	public void user_click_on_show_all_desktops() {
    desktops.UserclickonShowalldesktopsButton();
	}

	@Then("User should see all items are present in Desktops page")
	public void user_should_see_all_items_are_present_in_desktops_page() {
	    Assert.assertFalse(desktops.VerifyUIElementswithTagAondesktopsPage());
		logger.info("All Items are printed");
	}

	@Then("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
	   desktops.clickAddtoCartHPLP3065Button();
	   logger.info("an item added to the cart");
	}

	@And("^User select quantity '1'$")
	public void user_select_quantity() {
	    desktops.Enetr1Quantity("1");
	}

	@And("User click add to Cart button for HP")
	public void user_click_add_to_cart_button() {
	  desktops.AddtoCartbuttonHPLP3065D2();
	  logger.info("user clicked on Add to Cart button2");
	}

	@Then("^User should see a message ‘Success: you have added HP LP3065 to your Shopping cart!’$")
	public void user_should_see_a_message_success_you_have_added_hp_lp3065_to_your_shopping_cart() throws IOException {
	  desktops.user_should_see_a_message_success_you_have_added_hp_lp3065_to_your_shopping_cart();
	  logger.info("Successfully: You have added HP LP3065 to your shopping cart!");
	  Utilities.takeScreenShot(null);
	}
	@When("^User click ADD TO CART option on 'Canon EOS 5D' item$")
	public void user_click_add_to_cart_option_on_item() {
	    desktops.user_click_on_add_to_cart_button_of_CanonEOS5D();
	    logger.info("you have added CanonEOS5D");
	}

	@And("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
		desktops.user_select_color_from_dropdown_red();
	    logger.info("Red Color is Selected");
	}

	@And("^User select canon quantity '1'$")
	public void user_select_canon_quantity() { 
	desktops.User_select_canon_quantity("1");
	 logger.info("one item was entered to the cart");
	    
	}

    @And("User click add to Cart button canon") 
	public void User_click_add_to_Cart_button_canon() {
    	 desktops.addToCartButtonforCanon2();
 	    logger.info("user clicked on the canon add to cart after enterring the quantity 1");
    }
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
	desktops.user_click_on_canon_eos_5d_item();
		logger.info("clicked on Canon EOS 5D2");
	}
	

	@Then("User should see a message ‘Success: You have added Canon EOS 5D Camera to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() throws IOException {
	desktops.SuccessYouhaveaddedCanonEOS5DtoyourshoppingcartText();
	logger.info("Success: You have added Canon EOS 5D to your shopping cart successfully");
	Utilities.takeScreenShot("success message");
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
	    desktops.writeReviewlink();
	    logger.info("clicked on rewiev linked");
	}

	@When("^user fill the review information with below information '(.+)' '(.+)' '(.+)'$")
	public void user_fill_the_review_information_with_below_information(String name, String review, String rating) {
  desktops.user_fill_the_review_information_with_below_information("name", "review", "rating");
   desktops.enteryourName("yourname");
   desktops.enteryourRiview("yourReview");
	desktops.clickOnRadioButton("rating");
	}
	

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
	   desktops.ContinueButton();
	}

	@Then("User should see a message with 'Thank you for your review. It has been submitted to the webmaster for approval.'")
	public void user_should_see_a_message_with() throws IOException {
	Assert.assertTrue(desktops.ThankyouforyourreviewSuccessText()); 
	    logger.info("review successfully submitted");
	    Utilities.takeScreenShot("Review");
	}

}

	

