package gayatri;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Ddrive\\JavaSelenium-Udemycorse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.id("product"));
		System.out.println(table.findElements(By.tagName("tr")).size());
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		
		//System.out.println(table.findElements(By.tagName("tr")).get(2).getText());
		
		List<WebElement> columnval = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(columnval.get(0).getText());
		System.out.println(columnval.get(1).getText());
		System.out.println(columnval.get(2).getText());
		
		//enter 3 letter ind and select india from dropdown
		
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
	}
}
