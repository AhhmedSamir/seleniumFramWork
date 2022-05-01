package z2DataPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.PageBase;

public class DownloadExcelPage extends PageBase {

	public DownloadExcelPage(WebDriver driver) {
		super(driver);
	}
@FindBy(css="a.btnDL")
WebElement ExcelBtn;
@FindBy(xpath = "//*[@id=\"content-main\"]/div[2]/div[1]/div[1]/a")
WebElement DownloadBtn;
@FindBy(id="cc_gotit")
WebElement gotItBtn;
@FindBy(css="bodytemplates.templates_download")
WebElement body;
public void pressOnGotIt() {
	clickBTN(gotItBtn);
}
public void pressOnExcel() {
	clickBTN(ExcelBtn);
}
public void DownloadFile() {
	clickBTN(DownloadBtn);
}
public void pressOnBody() {
	clickBTN(body);
}

}
