package z2DataTests;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import org.testng.annotations.Test;
import tests.TestBase;
import z2DataPages.UploadImagePage;

public class UploadImageTest extends TestBase{

	UploadImagePage upload;
	@Test
	public void testUploadingImage() throws InterruptedException, AWTException {
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		upload = new UploadImagePage(driver);
		String imgName = "blank-profile-picture-973460_640.png";
		String imgPath = System.getProperty("user.dir")+"/Uploads/"+imgName;
		upload.uploadImage(imgPath);
		Thread.sleep(2000);
		assertEquals(imgName , upload.uploadedImage.getText());
	}
}
