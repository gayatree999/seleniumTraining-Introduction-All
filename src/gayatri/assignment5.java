package gayatri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Ddrive\\JavaSelenium-Udemycorse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// System.out.println(driver.findElement(By.id("checkBoxOption2")).getText());
		driver.findElement(By.id("checkBoxOption2")).click();
		String opt2 = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		System.out.println(opt2);

		WebElement staticdropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByVisibleText(opt2);
		driver.findElement(By.id("name")).sendKeys(opt2);
		driver.findElement(By.id("alertbtn")).click();

		String textInAlert = driver.switchTo().alert().getText();

		System.out.println(textInAlert);

		if (textInAlert.contains(opt2)) {
			System.out.println("matched option with alert message");
		} else
			System.out.println("something wrong with execution");

		driver.switchTo().alert().accept();
	}

}
