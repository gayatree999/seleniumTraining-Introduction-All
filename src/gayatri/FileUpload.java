package gayatri;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		String downloadPath= System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Ddrive\\JavaSelenium-Udemycorse\\chromedriver.exe");
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://smallpdf.com/pdf-to-jpg");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Choose File']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\Ddrive\\JavaSelenium-Udemycorse\\fileupload2.exe");
		Thread.sleep(8000);
		@SuppressWarnings("deprecation")
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Convert entire pages']")));
		driver.findElement(By.xpath("//*[text()='Convert entire pages']")).click();
		driver.findElement(By.xpath("//*[text()='Choose option']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Download']")));
		driver.findElement(By.xpath("//*[text()='Download']")).click();
		driver.findElement(By.xpath("//*[text()='Save to device']")).click();
		Thread.sleep(15000);

		//File f = new File("C:\\Users\\gnk1\\Downloads\\Gayatri_Nayak_Resume.jpg");
		
		File f = new File(downloadPath+"/Gayatri_Nayak_Resume.jpg");
		if(f.exists()) {
			//System.out.println("File Found");
			Assert.assertTrue(f.exists());
			if(f.delete())
				System.out.println("file deleted");
		}
		driver.close();
	}

}
