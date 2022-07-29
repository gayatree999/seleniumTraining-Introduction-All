package gayatri;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingalertwindow {

	public static void main(String[] args) throws InterruptedException {
		String myName = "gayu";
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Ddrive\\JavaSelenium-Udemycorse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(myName);
		driver.findElement(By.id("alertbtn")).click();
		// alert page - click ok
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		// alert -click cancel
		driver.findElement(By.id("name")).sendKeys(myName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
