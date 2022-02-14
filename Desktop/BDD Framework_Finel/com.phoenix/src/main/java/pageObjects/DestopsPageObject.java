package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import utilities.Utilities;


public class DestopsPageObject extends Base {

	public DestopsPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement textToValildate;

	@FindBy(xpath = "//a[@class='dropdown-toggle'][text()='Desktops']")
	private WebElement userclickDesktopstab;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement UserclickonShowalldesktopsButton;

	@FindBy(tagName = "a")
	private static List<WebElement> desktopsUIElementswithTagA;

	@FindBy(xpath = "//div[3]//div[1]//div[2]//div[2]//button[1]")
	private WebElement clickAddtoCartHPLP3065Button;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement Enetr1Quantity;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement AddtoCartbuttonHPLP3065D2;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement SuccessYouhaveaddedHPLP3065toyourshoppingcartText;

	@FindBy(xpath = "//div[@id='product-category']//div[2]//div[1]//div[2]//div[2]//button[1]")
	private WebElement clickAddtoChartButtonCanonEOS5D;

	@FindBy(xpath = "//select[@id='input-option226']")
	private WebElement userSelectColorFromDropDownRed;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement User_select_canon_quantity;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButtonforCanon2;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement SuccessYouhaveaddedCanonEOS5DtoyourshoppingcartText;

	@FindBy(xpath = "//div[@class='caption']//h4//a[contains(text(),'Canon EOS 5D Camera')]")
	private WebElement user_click_on_canon_eos_5d_item;

	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement writeReviewlink;

	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement yourNameField;

	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement yourRiviewField;

	@FindBy(xpath = "//input[@value='5']")
	private WebElement Rating5radioButton;

	@FindBy(xpath = "//input[@value='4']")
	private WebElement Rating4radioButton;

	@FindBy(xpath = "//button[@id='button-review']")
	private WebElement ContinueButton;

	@FindBy(xpath = "//div[contains(text(),'Thank you for your review. It has been submitted t')]")
	private WebElement ThankyouforyourreviewSuccessText;

	// div[@class='alert alert-success alert-dismissible']

	public void user_is_on_retail_website() {
		String text = textToValildate.getText();
		if (text.equalsIgnoreCase("TEST ENVIRONMENT")) {
			logger.info("Text verified!");
		} else {
   logger.info("Text does not match!");
		}

	}

	public void UserclickonDesktopstab() {

		userclickDesktopstab.click();
	}

	public void UserclickonShowalldesktopsButton() {

		UserclickonShowalldesktopsButton.click();

	}

	public boolean VerifyUIElementswithTagAondesktopsPage() {
		List<WebElement> desktopsUI = desktopsUIElementswithTagA;
		System.out.println(desktopsUI.size() + "Size of element in UI present");
		for (WebElement Element : desktopsUI) {
			logger.info(Element.getText() + "Text name of ech UI Element");

		}
		return false;
	}

	public void clickAddtoCartHPLP3065Button() {
		Utilities.clickWithJSE(clickAddtoCartHPLP3065Button);

	}

	public void Enetr1Quantity(String String) {
		
		Enetr1Quantity.sendKeys("1");

	}

	public void AddtoCartbuttonHPLP3065D2() {
        Utilities.waitAndClickElement(AddtoCartbuttonHPLP3065D2);
	}

	public void user_should_see_a_message_success_you_have_added_hp_lp3065_to_your_shopping_cart() {
		String text = SuccessYouhaveaddedHPLP3065toyourshoppingcartText.getText();
		if (text.equalsIgnoreCase("Success: You have added HP LP3065 to your shopping cart!")) {
			logger.info("text varified");
		} else {
			logger.info("text is not present");
		}

	}

	public void user_click_on_add_to_cart_button_of_CanonEOS5D() {
		Utilities.waitAndClickElement(clickAddtoChartButtonCanonEOS5D);
	}

	public void user_select_color_from_dropdown_red() {
		userSelectColorFromDropDownRed.click();
		Select dropDown = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));
		dropDown.selectByVisibleText("Red");

	}

	public void User_select_canon_quantity(String string) {
		User_select_canon_quantity.sendKeys("1");

	}

	public void addToCartButtonforCanon2() {
		Utilities.waitAndClickElement(addToCartButtonforCanon2);
	}

	public boolean SuccessYouhaveaddedCanonEOS5DtoyourshoppingcartText() {
		String text = SuccessYouhaveaddedCanonEOS5DtoyourshoppingcartText.getText();
		if (text.equalsIgnoreCase("Success: You have added Canon EOS 5D to your shopping cart!")) {

			logger.info("text is present");
		} else {
			logger.info("text is not presnet");
		}
		return false;
	}

	public void user_click_on_canon_eos_5d_item() {
		user_click_on_canon_eos_5d_item.click();
	}

	public void writeReviewlink() {
		writeReviewlink.click();
	}

	public void enteryourName(String string) {
		yourNameField.sendKeys("Noorul Hadi");
	}
	public void enteryourRiview(String string) {
		yourRiviewField.sendKeys("if I can get this camera for $98 I will give a 5 star rating any day of the week");
	}
	public void clickOnRadioButton(String string) {
		Utilities.waitAndClickElement(Rating5radioButton);
		logger.info("cliked on rating button");
	}
	
	public void user_fill_the_review_information_with_below_information(String name, String review, String String) {

		String rating = "";

		switch ("rating") {

		case "Excellent":
			yourNameField.sendKeys("Noorul Hadi");
			yourRiviewField
					.sendKeys("if I can get this camera for $98 I will give a 5 star rating any day of the week");
			Utilities.waitAndClickElement(Rating5radioButton);
			logger.info("name was entered, and review was written and it was rated 5 based on the condation");
			break;

		case "very good":
			yourNameField.sendKeys("Hashim");
			yourRiviewField
					.sendKeys("if I can get this camera for $98 I will give a 4 star rating any day of the week");
			Rating5radioButton.click();
			logger.info("name was entered, and review was written and it was rated 4 based on the condation");

		}

	}

	public void ContinueButton() {
		ContinueButton.click();
	}

	public boolean ThankyouforyourreviewSuccessText() {
		String actualReviewSuccessText = ThankyouforyourreviewSuccessText.getText();
		String expectedReviewSuccessText = "Thank you for your review. It has been submitted to the webmaster for approval.";
		if (actualReviewSuccessText.equals(expectedReviewSuccessText)) {
			return true;

		} else {
			return false;
		}
	}

}