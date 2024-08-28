package ChomeOptionsClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class ChromeOptions_HTTPCertifications {
	
	public static void main(String[] args) {
		
		//ChromeOptions options = new ChromeOptions();
		//FirefoxOptions options = new FirefoxOptions();
		EdgeOptions options = new EdgeOptions();
		options.setAcceptInsecureCerts(true);
		//WebDriver driver = new ChromeDriver(options);
		//WebDriver driver = new FirefoxDriver(options);
		WebDriver driver = new EdgeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
