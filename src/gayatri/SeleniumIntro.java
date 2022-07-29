package gayatri;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome - ChromeDrive> Methods
		// WebDriver - interface in java- a grp of related methods with empty bodies
		//chromedriver> chromebrowser
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Ddrive\\JavaSelenium-Udemycorse\\chromedriver.exe");
		//webdriver.chromedriver->value of path
		//WebDriver driver = new ChromeDriver();
		
		//Firefox driver-geckodriver
		//System.setProperty("webdriver.gecko.driver", "D:\\Ddrive\\JavaSelenium-Udemycorse\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver", "D:\\Ddrive\\JavaSelenium-Udemycorse\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		
		driver.get("https:rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();	
		
	}

}
