package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase{

	public SearchPage(WebDriver driver) {
		super(driver);
	}
@FindBy(id="small-searchterms")
WebElement searchBox;
@FindBy(css="button.button-1.search-box-button")
WebElement searchBtn;
@FindBy(id="ui-id-1")
List<WebElement> suggestList;
@FindBy(linkText = "Apple MacBook Pro 13-inch")
WebElement productDetailsLink;

public void searchForProduct(String productName) {
	sendTxtToElement(searchBox, productName);
	clickBTN(searchBtn);
}
public void oprnProductDetailsPage() {
	clickBTN(productDetailsLink);
}
public void searchUsingAutoSuggest(String productName) throws InterruptedException {
	sendTxtToElement(searchBox, productName);
	Thread.sleep(1000);
	suggestList.get(0).click();
}
}
