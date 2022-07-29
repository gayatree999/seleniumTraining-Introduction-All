package gayatri;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Ddrive\\JavaSelenium-Udemycorse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		driver.navigate().back();
		driver.navigate().forward();
		

	}

}
