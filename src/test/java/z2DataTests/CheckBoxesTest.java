package z2DataTests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.CheckoutPage;
import tests.TestBase;
import z2DataPages.CheckBoxesPage;

public class CheckBoxesTest extends TestBase{

	CheckBoxesPage chech ;
	@Test
	public void testCheckBoxes() {
		driver.navigate().to("https://the-internet.herokuapp.com/checkboxes");
	chech = new CheckBoxesPage(driver);
	chech.clickOnCheckBox1();
	assertTrue(chech.checkBox1.isSelected());
	assertTrue(chech.checkBox2.isSelected());

	}
}
