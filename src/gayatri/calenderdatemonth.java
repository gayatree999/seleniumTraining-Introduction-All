package gayatri;
//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;

public class calenderdatemonth{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("driver.chrome.driver", "D:\\Ddrive\\JavaSelenium-Udemycorse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		Thread.sleep(5000);
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May")) {
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		//List<WebElement> dates = driver.findElements(By.className("day"));
		//Grab common attribute //put it into List and iterate
		int count = driver.findElements(By.className("day")).size();
		
		for( int i = 0; i<count; i++)
		{
			String text = driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("2")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
	
	
	
	}	
}
