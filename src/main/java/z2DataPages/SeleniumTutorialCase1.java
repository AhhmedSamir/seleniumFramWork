package z2DataPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.PageBase;

public class SeleniumTutorialCase1 extends PageBase{

	public SeleniumTutorialCase1(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="input.gLFyf.gsfi")
	WebElement txtBox;
	@FindBy(css="input.gNO89b")
	WebElement searchBtn;
	public void googleSearch(String text) {
		sendTxtToElement(txtBox, text);
		clickBTN(searchBtn);
	}
	
	
}
