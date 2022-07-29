package gayatri;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdown {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome,driver", "D:\\Ddrive\\JavaSelenium-Udemycorse\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//a[@value='STV']")).click();
			//parent child relationship xpath
			driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']//a[@value='STV']")).click();
			
			Thread.sleep(2000);
			//xpath by index
			//driver.findElement(By.xpath("(//a[@value='COK'])[2]")).click();
			//xpath by parent child relationship
			driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='COK']")).click();
			Thread.sleep(2000);
			//select current date of calendar,which is by default in active state
			//driver.findElement(By.cssSelector("a[class='ui-state-default']")).click();
			driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
			
			
			
		
					
	}

	

}
