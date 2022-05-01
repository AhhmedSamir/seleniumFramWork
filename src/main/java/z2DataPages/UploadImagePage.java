package z2DataPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.PageBase;

public class UploadImagePage extends PageBase{

	public UploadImagePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="file-upload")
	WebElement chooseFileBtn;
	@FindBy(id="file-submit")
	WebElement uploadBtn;
	@FindBy(id="uploaded-files")
	public WebElement uploadedImage;
	public void uploadImage(String image) {
		sendTxtToElement(chooseFileBtn,image);
		clickBTN(uploadBtn);
	}
}
