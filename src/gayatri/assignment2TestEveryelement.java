package gayatri;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2TestEveryelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome,driver", "D:\\Ddrive\\JavaSelenium-Udemycorse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("gayatri");
		//Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("gayat@gmail.com");
		//Thread.sleep(2000);
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.id("exampleCheck1")).click();
		//Thread.sleep(2000);
		WebElement staticDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticDropdown);
		//dropdown.selectByIndex(1);
		dropdown.selectByVisibleText("Female");
		Thread.sleep(2000);
		driver.findElement(By.id("inlineRadio1")).click();
		//Thread.sleep(2000);
		driver.findElement(By.name("bday")).sendKeys("12/30/2022");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		//Thread.sleep(4000);
		System.out.println(driver.findElement(By.xpath("//strong[contains(text(),'Success!')]")).getText());
		


	}

}
