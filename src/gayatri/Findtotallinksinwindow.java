package gayatri;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Findtotallinksinwindow {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Ddrive\\JavaSelenium-Udemycorse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		//Limiting webdriver scope
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement buttomcolumn = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(buttomcolumn.findElements(By.tagName("a")).size());
		
		for(int i=1; i<buttomcolumn.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			buttomcolumn.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);			
			//driver.navigate().back();
			Thread.sleep(5000);
		}
			Set<String> abc = driver.getWindowHandles(); //4
			Iterator<String> it = abc.iterator();
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
	}
}
