package z2DataTests;

import org.testng.annotations.Test;

import tests.TestBase;
import z2DataPages.TablesPage;

public class TableTest extends TestBase {

	TablesPage table ;
	@Test
	public void testingTable() {
		// note: i didn't know how to exactly assert the country value for a specific company , 
		// so my test was based on ensuring that "the company name" "the contact" and "the country"
		// all the three values appears in the same line :)
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		table = new TablesPage(driver);
		table.assertingTheCountry();
	}
}
