package z2DataTests;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import tests.TestBase;
import z2DataPages.DownloadExcelPage;

public class DownloadExcelTest extends TestBase{

	DownloadExcelPage down;
	@Test
	public void DownloadExcelFile() {
		driver.navigate().to("https://www.vertex42.com/ExcelTemplates/excel-gantt-chart.html");
		down = new DownloadExcelPage(driver);
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		down.pressOnGotIt();
		down.pressOnExcel();
		driver.navigate().to("https://www.vertex42.com/Files/download2/themed.php?file=gantt-chart_L.xlsx");
		assertTrue(driver.getCurrentUrl().contains("https://www.vertex42.com/Files/download2/themed.php?file=gantt-chart_L.xlsx"));
		down.DownloadFile();
	}
}
