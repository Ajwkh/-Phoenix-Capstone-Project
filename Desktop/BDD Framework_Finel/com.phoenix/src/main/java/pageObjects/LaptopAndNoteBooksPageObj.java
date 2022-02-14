package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;
import org.junit.Assert;
import utilities.Utilities;

public class LaptopAndNoteBooksPageObj extends Base {

	public LaptopAndNoteBooksPageObj() {
		PageFactory.initElements(driver, this);
	}

//	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
//	private WebElement textToValildate;
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndNoteBooksTab;
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooks;
	@FindBy(xpath = "//img[@alt='MacBook']")
	private WebElement macBookItem;
	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement addToCartButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartTotal;
	@FindBy(xpath = "//table[@class='table table-striped']//tr//td//button")
	private WebElement removeButton;
	@FindBy(xpath = "//div[@id='product-category']//div[2]//div[1]//div[2]//div[2]//button[3]")
	private WebElement compareButtonofMacBook;
	@FindBy(xpath = "//div[3]//div[1]//div[2]//div[2]//button[3]")
	private WebElement comareButtonMacBookAir;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageYouAddedMacBook;
	@FindBy(xpath = "(//a[text()='Product Compare (2)'])[1]")
	private WebElement productComparisonlink;
	@FindBy(xpath = "//h1[text()='Product Comparison']")
	private WebElement productComparisonText;
	@FindBy(xpath = "//div[5]//div[1]//div[2]//div[2]//button[@data-original-title='Add to Wish List']")
	private WebElement addToWishListofSonyVAIO;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement youMustLoginOrCreatAccountText;
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement MacBookProItem;
	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement validatePriceForMacBookPro;

//	public void user_is_on_retail_website() {
//		String text = textToValildate.getText();
//		if (text.equalsIgnoreCase("TEST ENVIRONMENT")) {
//			logger.info("Text verified!");
//		} else {
//			logger.info("Text does not match!");
//		}
//
//	}
	public void clickOnlaptopsAndNoteBooksTab() {
		laptopsAndNoteBooksTab.click();
	}

	public void clickOnlaptopsAndNoteBooksFromList() {
		showAllLaptopsAndNotebooks.click();
	}

	public void clickOnMacBookItem() {
		Utilities.waitAndClickElement(macBookItem);
	}

	public void clickOnAddToCartButton() {
		Utilities.waitAndClickElement(addToCartButton);
	}

	public void verifySuccessMessage(String strSuccessMessage) {
		String actualSuccessMssg = successMessage.getText();
		String strString = actualSuccessMssg.substring(0, 54);
		Assert.assertEquals(strSuccessMessage, strString);
	}

	public void verifyCartTotal(String strCartTotal) {
		String actualCartTotal = cartTotal.getText();
		Assert.assertEquals(strCartTotal, actualCartTotal);
	}

	public void clickOnCartOption() {
		Utilities.waitAndClickElement(cartTotal);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnRemoveItemButton() {
		Utilities.waitAndClickElement(removeButton);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCartTotalAfterRemovingItem(String strCartTotalAfterRemove) {
		String actualCartTotal = cartTotal.getText();
		System.out.println("actual cart total after removing: =======" + actualCartTotal);
		Assert.assertEquals(strCartTotalAfterRemove, actualCartTotal);
		System.out.println(actualCartTotal);
	}

	public void compareButtonofMacBook() {
		Utilities.waitAndClickElement(compareButtonofMacBook);
	}

	public void comareButtonMacBookAir() {
		Utilities.waitAndClickElement(comareButtonMacBookAir);
	}
	
//	public void successMessageYouAddedMacBook() {
//
//		String actualsuccessMessageYouAddedMacBookAir = successMessageYouAddedMacBook.getText();
//		String expectedstrString = "Success: You have added MacBook Air to your product comparison";
//		System.out.println("test here +++++++" + successMessageYouAddedMacBook);
//		Assert.assertEquals(expectedstrString, actualsuccessMessageYouAddedMacBookAir);
//
//	}


	public void productComparisonlink() {
		Utilities.waitAndClickElement(productComparisonlink);

	}

	public void productComparisonText() {
		String text = productComparisonText.getText();

		if (text.equalsIgnoreCase("Product Comparison")) {
			logger.info("text is presnt on comparison page");

		} else {
			logger.info("text is not present on comparion page");
		}

	}

	public void addToWishListofSonyVAIO() {

		Utilities.waitAndClickElement(addToWishListofSonyVAIO);
		logger.info("Add to Wish List of Sony");
	}

	public void youMustLoginOrCreatAccount() {
		youMustLoginOrCreatAccountText.getText();
		if (youMustLoginOrCreatAccountText.isDisplayed()) {
			logger.info(" You must login or create an account to save Sony VAIO to your wish list! is posted");
		} else {
			logger.info("text is not posted");
		}

	}

	public void MacBookProItem() {
		Utilities.waitAndClickElement(MacBookProItem);
	}

	public void validatePriceForMacBookPro() {

		String ActualItemPrice = validatePriceForMacBookPro.getText();
		System.out.println("the price for MacBook pro" + ActualItemPrice);
		String expectedItemPrice = ActualItemPrice;
		Assert.assertEquals(expectedItemPrice, ActualItemPrice);

	}

}
