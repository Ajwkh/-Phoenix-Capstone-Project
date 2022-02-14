package pageObjects;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

import utilities.Utilities;

public class HomePageObject extends Base {

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement clickonCurrency;

	@FindBy(xpath = "//ul[@class='dropdown-menu']//li[1]")
	private WebElement chooseEuroCurrency;

	@FindBy(xpath = "//strong[contains(text(),'€')]")
	private WebElement verifyeuroCurrencyIsSelected;
	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement shoppingCartButton;

	@FindBy(xpath = "//ul[@class='dropdown-menu pull-right']")
	private WebElement shoppingCartisEmpty;

	public void userclickonCurrency() {

		Utilities.waitAndClickElement(clickonCurrency);
	}

	public void userchooseEuroCurrency() {
		driver.findElement(By.xpath("//span[text()='Currency']"));
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li[1]")).click();

	}

	@SuppressWarnings("deprecation")
	public void verifyeuroCurrencyIsSelected() {
		String ActualStrEurocurrency = verifyeuroCurrencyIsSelected.getText();
		String StrEurocurrency = "€";
		Assert.assertEquals(StrEurocurrency, ActualStrEurocurrency);

	}

	public void clickshoppingCartButton() {
		Utilities.clickWithJSE(shoppingCartButton);
	}

	
	@SuppressWarnings("deprecation")
	public void shoppingCartisEmptyMessage() {
		String ActualStrShoppingCartMessage = shoppingCartisEmpty.getText();
		String expectedStrShoppingcartMessage = "Your shopping cart is empty!";
		try {
			Assert.assertEquals(expectedStrShoppingcartMessage, ActualStrShoppingCartMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
