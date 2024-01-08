import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class localizadores_tradicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setear webdriver
		System.setProperty("webdriver.Chrome", "C:\\Users\\Usuario\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		
		//Localizar elemento por Id
		System.out.println(driver.findElement(By.id("APjFqb")));
		
		//Localizar elemento por Clase.
		System.out.println(driver.findElement(By.className("gb_B")));
		
		//Localizar elemento por Name
		System.out.println(driver.findElement(By.name("btnK")));
		
		//Localizar elemento por linkText
		System.out.println(driver.findElement(By.linkText("Imágenes" )));
		
		
		
		//cerrar          quit para cerrar sesion 
		driver.close();   driver.quit();
		
	}

}
