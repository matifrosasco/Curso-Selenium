import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome", "C:\\Users\\Usuario\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		
		WebElement iframe = driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/iframe"));
		driver.switchTo().frame(iframe); //cambiamos al ifram de la pagina 
		driver.findElement(By.linkText("CSS Tutorial")).click();
		driver.switchTo().defaultContent(); //volvemos a la pagina o "foco" principal
		
	}

}
