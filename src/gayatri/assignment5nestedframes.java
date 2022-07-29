package gayatri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment5nestedframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Ddrive\\JavaSelenium-Udemycorse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();
		Thread.sleep(4000);
		
		////Also you can write by providing direct frame name in the .frame
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		
		//Also you can write in webelement way
		//driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		//driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
		
		
		
		System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
		

	}

}
