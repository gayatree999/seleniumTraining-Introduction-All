package gayatri;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Wahoofitness {
	private final WebDriver driver;

	public Wahoofitness() {
		System.setProperty("webdriver.chrome.driver", "D:\\Ddrive\\JavaSelenium-Udemycorse\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void launchWebsite() {
		driver.get("https://eu.wahoofitness.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	public WebElement findElement(String by, String locator) {
		WebElement we = null;
		switch (by) {
		case "XPATH": {
			return findElementByXpath(locator);
		}
		case "LINKTEXT": {
			return findElementBylinkText(locator);
		}
		case "PARTIALLINKTEXT": {
			return findElementByPartialLinkText(locator);
		}
		case "NAME": {
			return findElementByName(locator);
		}
		case "ID": {
			return findElementById(locator);
		}
		}
		return we;
	}

	public WebElement findElementByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	public WebElement findElementBylinkText(String linkText) {
		return driver.findElement(By.linkText(linkText));
	}

	public WebElement findElementByPartialLinkText(String partialLinkText) {
		return driver.findElement(By.partialLinkText(partialLinkText));
	}

	public WebElement findElementByName(String name) {
		return driver.findElement(By.name(name));
	}

	public WebElement findElementById(String id) {
		return driver.findElement(By.id(id));
	}

	public static void main(String[] args) throws InterruptedException {

		Wahoofitness wahoofitness = new Wahoofitness();
		wahoofitness.launchWebsite();
		SoftAssert softAssert = new SoftAssert();
		WebDriverWait wait = new WebDriverWait(wahoofitness.getDriver(), Duration.ofSeconds(10));
		
		wahoofitness.findElement("XPATH", "//span[contains(text(),'SHOP')]").click();
		wahoofitness.findElement("XPATH", "//span[text()='Add to Cart']").click();
		Thread.sleep(5000);
		wahoofitness.findElement("ID", "btn-minicart-close").click();
		String addedProd1 = wahoofitness.findElement("LINKTEXT", "KICKR Smart Trainer").getText();
		softAssert.assertEquals(addedProd1, "KICKR Smart Trainer");
		wahoofitness.findElement("XPATH", "//*[@id=\"section-4\"]/div/div/ul/li[3]/div[2]/div[3]/form/button/span")
				.click();
		String addedProd2 = wahoofitness.findElement("PARTIALLINKTEXT", "KICKR SNAP Bike Trainer").getText();
		softAssert.assertEquals(addedProd2, "KICKR SNAP Bike Trainer");
		wahoofitness.findElement("XPATH", "//span[contains(text(),'Remove')]").click();
		wahoofitness.findElement("XPATH", "//span[contains(text(),'OK')]").click();
		String removedMessage = wahoofitness
				.findElement("XPATH", "//span[contains(text(),'Item was removed successfully')]").getText();
		softAssert.assertEquals(removedMessage, "Item was removed successfully");
		wahoofitness.findElement("XPATH", "//span[contains(text(),'View and Edit Cart')]").click();
		wahoofitness.findElement("XPATH", "//input[@type='number']").clear();
		wahoofitness.findElement("XPATH", "//input[@type='number']").sendKeys("2");
		wahoofitness.findElement("XPATH", "//span[contains(text(),'Update Cart')]").click();
		wahoofitness.findElement("XPATH", "//button[@title=\"Proceed to Checkout\"]").click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),' Place Order')]")));
		wahoofitness.findElement("XPATH", "//span[contains(text(),' Place Order')]").click();
		wahoofitness.findElement("XPATH", "//input[@id='s_method_amstrates_amstrates22']").click();
		wahoofitness.findElement("NAME", "username").sendKeys("someone@whocares.com");
		wahoofitness.findElement("XPATH", "//input[@name='firstname']").sendKeys("Test");
		wahoofitness.findElement("XPATH", "//input[@name='lastname']").sendKeys("Tester");
		wahoofitness.findElement("XPATH", "//input[@name='street[0]']")
				.sendKeys("Comandante Izarduy 67, Barcelona 08940");
		wahoofitness.findElement("XPATH", "//input[@name='city']").sendKeys("Eindhoven");
		wahoofitness.findElement("XPATH", "//input[@type='tel']").sendKeys("5555555555");
		wahoofitness.findElement("XPATH", "//iframe[contains(@name,'privateStripeFrame')]")
				.sendKeys("4111111111111111");
		Thread.sleep(6000);
		wahoofitness.driver.switchTo().defaultContent();
		wahoofitness.findElement("XPATH", "//span[contains(text(),' Place Order')]").click();
		String errroMessage = wahoofitness
				.findElement("XPATH", "//div[@data-ui-id='checkout-cart-validationmessages-message-error']").getText();
		softAssert.assertEquals(errroMessage, "Please verify you card information.");
		
		//If List of Product names required
		/*String[] itemsNeeded = { "KICKR CORE SMART TRAINER", "KICKR BIKE"};
		Thread.sleep(3000);
		additemfunction(driver,itemsNeeded);
		Thread.sleep(20);
		//driver.findElement(By.xpath("//div[@class='actions']/button/span[1]")).click();
	}
	public static void additemfunction(WebDriver driver, String[] itemsNeeded) {

		List<WebElement> products = driver.findElements(By.cssSelector("p.product-name"));
		int j = 0;
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split(" ");
			String formattedName = name[1].trim();

			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//span[text()='Add to Cart']")).get(i).click();
				
				if (j == itemsNeeded.length)
					break;
			}
		}*/

	}

	public WebDriver getDriver() {
		return driver;
	}
	

}
