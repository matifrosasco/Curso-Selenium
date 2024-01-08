import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class metodos_basicos_selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setear webdriver
		System.setProperty("webdriver.Chrome", "C:\\Users\\Usuario\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver_chrome =new ChromeDriver();
		
		//metodo 1: Get(). Nos abre la pagina requerida.
		driver_chrome.get("https://www.google.com");
		
		//metodo 2: getTitle(). Nos trae el titulo de la pagina actual. 
		System.out.println(driver_chrome.getTitle());
		
		//metodo 3: getCurrentUrl(). Nos muestra la direccion acutal de la pagina.
		System.out.println("La pagina actual es: " + driver_chrome.getCurrentUrl());
		
		//metodo 4: .close(). Cierra el navegador. - .quit() hace lo mismo, pero cierra sesion
		driver_chrome.close();
		
		
		
		
		
		
		
	}
}
