import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_chrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//validando chrome driver
		
		System.setProperty("webdriver.Chrome", "C:\\Users\\Usuario\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//abrimos google. 
		WebDriver driver_chrome =new ChromeDriver();
		driver_chrome.get("https://www.google.com");
	}
}
