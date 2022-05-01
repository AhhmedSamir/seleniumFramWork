package z2DataPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.PageBase;

public class CheckBoxesPage extends PageBase{

	public CheckBoxesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id=\"checkboxes\"]/input[1]")
	public WebElement checkBox1;
	@FindBy(xpath = "//*[@id=\"checkboxes\"]/input[2]")
	public WebElement checkBox2;
	public void clickOnCheckBox1() {
		clickBTN(checkBox1);
	}
}
