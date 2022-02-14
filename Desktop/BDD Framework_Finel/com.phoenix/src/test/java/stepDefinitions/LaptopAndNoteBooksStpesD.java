package stepDefinitions;

import java.io.IOException;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LaptopAndNoteBooksPageObj;
import utilities.Utilities;

public class LaptopAndNoteBooksStpesD extends Base {

	LaptopAndNoteBooksPageObj laptopAndNoteBooks = new LaptopAndNoteBooksPageObj();

	
	
//	@Given("^User is on Retail website$")
//	public void User_is_on_Retail_website() throws IOException {
//		laptopAndNoteBooks.user_is_on_retail_website();
//		Utilities.takeScreenShot("RetailPage");
//	}

//	@Given("User is on Retail Website")
//	public void user_is_on_retail_website() {
//	   
//	}

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
	    laptopAndNoteBooks.clickOnlaptopsAndNoteBooksTab();
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptopAndNoteBooks.clickOnlaptopsAndNoteBooksFromList();
	}
	

	@And("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		laptopAndNoteBooks.clickOnMacBookItem();
	}
	@And("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		laptopAndNoteBooks.clickOnAddToCartButton();
	}
	@And("User should see a message {string}")
	public void user_should_see_a_message(String string) throws IOException {
		System.out.println("string from stepDefinition method: " + string);
		laptopAndNoteBooks.verifySuccessMessage(string);
		Utilities.takeScreenShot("laptopAndNoteBooksPage");
	}
	@Then("User should see {string} showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart(String string) throws IOException {
		laptopAndNoteBooks.verifyCartTotal(string);
		Utilities.takeScreenShot("item added");
	}
	@And("User click on cart option")
	public void user_click_on_cart_option() {
		laptopAndNoteBooks.clickOnCartOption();
	}

	@And("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopAndNoteBooks.clickOnRemoveItemButton();
	}
	@And("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) {
		laptopAndNoteBooks.verifyCartTotalAfterRemovingItem(string);
	}
	@When("^User click on product comparison icon on ‘MacBook’$")
	public void User_click_on_product_comparison_icon_on_MacBook() {
		laptopAndNoteBooks.compareButtonofMacBook();
	}
	
//	@Then("User should see a message ‘Success: You have added MacBook to your product comparison!’")
//	public void User_should_see_a_message_Success_You_have_added_MacBook_Air_to_your_product_comparison() throws IOException {
//		laptopAndNoteBooks.successMessageYouAddedMacBook();
//		Utilities.takeScreenShot("success message of comparison");
//	
//		
//	}
	
	@And("^User click on product comparison icon on ‘MacBook Air$")
	public void User_click_on_product_comparison_icon_on_MacBook_Air() {
		laptopAndNoteBooks.comareButtonMacBookAir();

	}
	
	@And("^User click on Product comparison link$")
	public void User_click_on_Product_comparison_link() {
		laptopAndNoteBooks.productComparisonlink();
	}
	@Then("^User should see Product Comparison Chart$")
	public void User_should_see_Product_Comparison_Chart() throws IOException {
		laptopAndNoteBooks.productComparisonText();
		logger.info("we are on comparison page");
		Utilities.takeScreenShot("Comparison product page");
	}
	@And("^User click on heart icon to add ‘Sony VaIO’ laptop to wish list$")
	public void User_click_on_heart_icon_to_add_SonyVaIO_laptop_to_wish_list() {
		laptopAndNoteBooks.addToWishListofSonyVAIO();
	}
	@Then("^User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’$")
	public void User_should_get_a_message_You_must_login_or_create_an_account_to_save_Sony_VAIO_to_your_wish_list() throws IOException {
		laptopAndNoteBooks.youMustLoginOrCreatAccount();
		logger.info("text is posted");
		Utilities.takeScreenShot("laptopAndNoteBooks");
	}
    @And("^User click on ‘MacBook Pro’ item$")
    public void User_click_on_MacBook_Pro_item() {
    	laptopAndNoteBooks.MacBookProItem();
    	logger.info("user clicked on MacBook Pro");
    }
	
    @Then("User should see ‘$2,000.00’ price tag is present on UI")
    public void PricetagForMacBookPro() throws IOException {
    	laptopAndNoteBooks.validatePriceForMacBookPro();
    	logger.info("validated the price tag for MacBook Pro is $2,000.00");
    	Utilities.takeScreenShot("price Validation");
    }
	
}
