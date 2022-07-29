package gayatri;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleNewwindowHandle {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.", "D:\\Ddrive\\JavaSelenium-Udemycorse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//Switching Window
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handles  = driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWinId= it.next();
		String childWinId= it.next();
		driver.switchTo().window(childWinId);
		driver.get("https://rahulshettyacademy.com/");
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
		driver.switchTo().window(parentWinId);
		WebElement name = driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(courseName);
		//driver.quit();
		
		//SCREENSHOT
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("coursenameimg.png"));
		//get Height and Width
		System.out.println(name.getRect().getHeight());
		System.out.println(name.getRect().getWidth());
	}
}
