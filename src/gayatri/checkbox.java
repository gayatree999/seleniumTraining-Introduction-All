package gayatri;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome,driver", "D:\\Ddrive\\JavaSelenium-Udemycorse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//assert to check if the check box is false and then proceed
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*=IndArm]")).isSelected());
		//show if the check box is checked or not
		//System.out.println(driver.findElement(By.cssSelector("input[id*=IndArm]")).isSelected());
		Thread.sleep(2000);
		//check the check box
		driver.findElement(By.cssSelector("input[id*=IndArm]")).click();
		//show if the check box is checked or not
		System.out.println(driver.findElement(By.cssSelector("input[id*=IndArm]")).isSelected());
		Thread.sleep(2000);
		//count how many check boxes
		//System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).size());
		
		//select round trip radio button
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Its enbled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}

	}

}
