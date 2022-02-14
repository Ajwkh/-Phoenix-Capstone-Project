package stepDefinitions;

import java.io.IOException;

import core.Base;
import io.cucumber.java.en.*;
import pageObjects.HomePageObject;
import utilities.Utilities;

public class HomePageSteps extends Base {

	HomePageObject HpageObject = new HomePageObject();
	
	
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		HpageObject.userclickonCurrency();
	}

	@When("User Choose Euro from dropdown")
	public void user_chose_euro_from_dropdown()  {
		HpageObject.userchooseEuroCurrency();
		
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() throws IOException {
		HpageObject.verifyeuroCurrencyIsSelected();
		logger.info("EuroCurrency is selected successfully");
		Utilities.takeScreenShot("CurrencyHomePage");
	}
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		HpageObject.clickshoppingCartButton();
	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() throws IOException {
		HpageObject.shoppingCartisEmptyMessage();
		logger.info("verified Shopping cart message is empty showed up");
		Utilities.takeScreenShot("shoppin cart");
	}
	
	
	
}
