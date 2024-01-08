import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.ElementNotInteractableException;

public class tipo_waits {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setear webdriver
		System.setProperty("webdriver.Chrome", "C:\\Users\\Usuario\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	
		//Implicit wait. Se toma el tiempo definido, si encuentra continua, despues error.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//se pone siempre al comienzo
		driver.get("https://www.google.com");
		driver.findElement(By.className("Gdd5U11"));
		
		//Explicit wait. 
		driver.get("https://www.google.com");
		WebElement imagen= driver.findElement(By.className("gLFyf"));
		WebDriverWait waiti =new WebDriverWait(driver,Duration.ofSeconds(10));
		waiti.until(imageshow -> imagen.isDisplayed());
		driver.findElement(By.className("gLFyf")).sendKeys("selenium"); //sendKeys introduce escritura
		
		//Fluent Wait. Como un ciclo. 
		
		driver.get("https://www.google.com");
		WebElement image= driver.findElement(By.className("gLFyf"));
		Wait<WebDriver>wait =new FluentWait<>(driver)
			.withTimeout(Duration.ofSeconds(2))
			.pollingEvery(Duration.ofMillis(300))
			.ignoring(ElementNotInteractableException.class);
		wait.until(d->{
			image.sendKeys("Selenium");
			return true;
		});
		
	}

}
