import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.Chrome", "C:\\Users\\Usuario\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.className("gb_B")).click();
		driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
		driver.findElement(By.name("identifier")).sendKeys("mati.frosasco@gmail.com");
		driver.findElement(By.xpath("//span[text()='Siguiente']")).click();
		//driver.close();
		

	}

}
