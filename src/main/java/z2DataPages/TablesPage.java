package z2DataPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import dev.failsafe.internal.util.Assert;
import pages.PageBase;

public class TablesPage extends PageBase{

	public TablesPage(WebDriver driver) {
		super(driver);
	}
    @FindBy(tagName = "tr")
    List<WebElement>rows ;
    @FindBy(tagName = "td")
    List<WebElement> cols;

	public void assertingTheCountry() {
		for ( WebElement row :rows ) {
			System.out.println(row.getText());
			for ( WebElement col : cols) {
			}
			System.out.println("\t");

		}
		
	}
	
	


		
	}
