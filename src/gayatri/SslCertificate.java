package gayatri;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SslCertificate {

	public static void main(String[] args) {
		//handling of ssl certificate
		ChromeOptions opt = new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		
		//set proxy through chrome options
		Proxy prox = new Proxy();
		prox.setHttpProxy("ipadress:9999");
		opt.setCapability("proxy", prox);
		
		//to download file at a specific folder
		Map<String, Object> pref = new HashMap<String, Object>();
		pref.put("download.default_directory", "D:\\Ddrive");
		opt.setExperimentalOption("prefs", pref);
		
		//handle pop up
		opt.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		
		System.setProperty("webdriver.chrome.driver", "D:\\Ddrive\\JavaSelenium-Udemycorse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		

	}

}
