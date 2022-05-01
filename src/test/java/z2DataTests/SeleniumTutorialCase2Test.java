package z2DataTests;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import tests.TestBase;
import z2DataPages.SeleniumTutorialCase1;

public class SeleniumTutorialCase2Test extends TestBase{

	SeleniumTutorialCase1 sel ;
	@DataProvider(name = "searchValue")
	public Object[][] searchData() throws IOException{
		ExcelReader er = new ExcelReader();
		return er.getExcelData();
	}
	@Test (dataProvider = "searchValue")
public void searchForSeleniumTutorial(String text) {
		driver.navigate().to("https://www.google.com");
		sel = new SeleniumTutorialCase1(driver);
		sel.googleSearch(text);
		driver.navigate().to("https://www.tutorialspoint.com/selenium/index.htm");
		assertTrue(driver.getCurrentUrl().contains("https://www.tutorialspoint.com/selenium/index.htm"));
	}
}
