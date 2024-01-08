import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class navegacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setear webdriver
		System.setProperty("webdriver.Chrome", "C:\\Users\\Usuario\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.mercadolibre.com.ar/#from=homecom");
		
		//ir a otra pagina 
		driver.navigate().to("https://www.youtube.com");
		
		//regresar a la pagina anterior
		driver.navigate().back();
		
		//ir adelante
		driver.navigate().forward();
		
		//actualizar
		driver.navigate().refresh();
		
		

	}

}
