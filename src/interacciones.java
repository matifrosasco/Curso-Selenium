import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class interacciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setear webdriver
		System.setProperty("webdriver.Chrome", "C:\\Users\\Usuario\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercadolibre.com.ar/#from=homecom");
		
		//send keys
		driver.findElement(By.id("cb1-edit")).sendKeys("Consola de videojuegos");
		
		//clear
		driver.findElement(By.id("cb1-edit")).clear();
		
		//ingresa busqueda correcta
		driver.findElement(By.id("cb1-edit")).sendKeys("Play station 4 ");
		
		//click en buscar
		driver.findElement(By.className("nav-icon-search")).click();
		
		//selecciona solo consolas
		driver.findElement(By.id("categorySearch")).click();
		
		//click en buscar
		driver.findElement(By.className("nav-icon-search")).click();
		
		//seleccion la 1 opcion
		driver.findElement(By.className("ui-search-item__title")).click();
		
		//seleccion de cantidades
		//driver.findElement(By.id("quantity-selector")).click();
		
		//2 unidades
		//driver.findElement(By.id(":r6:-1")).click();
		
		//comprar
		driver.findElement(By.id(":R15d5a6c4vi:")).click();
	
	}
}
