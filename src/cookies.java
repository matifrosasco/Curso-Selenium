import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
import org.openqa.*;
public class cookies {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome", "C:\\Users\\Usuario\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		
		//obtener cookie por nombre
		Cookie cookie1=driver.manage().getCookieNamed("AEC");
		System.out.println(cookie1);
		
		//obtener todas las cookies
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println(cookies);
		
		//eliminar cookie
		driver.manage().deleteCookie(cookie1); //eliminar todas las cookies: deleteAllCookies
	
		

	}

}
