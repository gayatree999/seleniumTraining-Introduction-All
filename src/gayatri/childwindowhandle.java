package gayatri;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childwindowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Ddrive\\JavaSelenium-Udemycorse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles(); //[parentid , childid, subchildid]
		Iterator<String> it = windows.iterator();
		String parentwinid = it.next();
		String childwinid = it.next();
		driver.switchTo().window(childwinid);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String emailid = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentwinid);
		driver.findElement(By.id("username")).sendKeys(emailid);
		

	}

}
