package gayatri;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class scrollwindow {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","D:\\Ddrive\\JavaSelenium-Udemycorse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn-info")));
		 * driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("gayatree999@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Krishnaaa@123");
		driver.findElement(By.name("login")).click();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");*/
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<values.size();i++) {
			sum = sum+ Integer.parseInt(values.get(i).getText());
		}
		System.out.println(sum);
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, total);
		
	}

}
