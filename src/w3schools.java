import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class w3schools {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.Chrome", "C:\\Users\\Usuario\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		String url= "https://www.w3schools.com";
		
		driver.get(url);
		
		driver.findElement(By.id("search2")).sendKeys("Java Tutorial");;
		driver.findElement(By.id("learntocode_searchicon")).click();
		
		
		
	}

}
