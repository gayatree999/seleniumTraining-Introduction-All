package gayatri;
import java.time.Duration;
//import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment3waitslecture80 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Ddrive\\JavaSelenium-Udemycorse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()=' User']")).click();
		Thread.sleep(2000);		
		driver.findElement(By.id("okayBtn")).click();
		WebElement staticDropdown = driver.findElement(By.cssSelector("select.form-control"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn-info")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		
		List<WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
		for (int i = 0; i < products.size(); i++)
		{
			products.get(i).click();
		}
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		//driver.findElement(By.partialLinkText("Checkout")).click();
	}		
}

