
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class obtener_informacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setear webdriver
		System.setProperty("webdriver.Chrome", "C:\\Users\\Usuario\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.mercadolibre.com.ar/#from=homecom");
		
		//regresa un valor booleano si el elemento se ha mostrado.
		boolean deliveryvisible=driver.findElement(By.className("nav-logo")).isDisplayed();
		System.out.println(deliveryvisible);
		
		//regresa un valor booleano si el elemento esta disponible.
		boolean disponible= driver.findElement(By.id("cb1-edit")).isEnabled();
		System.out.println(disponible);
		
		//regresa el tagname del element, input, spam , div, i etc (barra de busqueda)
		String nametag= driver.findElement(By.id("cb1-edit")).getTagName();
		System.out.println(nametag);
		
		//regresa informacion de la imagen, ubicacion,tamaño
		Rectangle imgml = driver.findElement(By.className("nav-logo")).getRect();
		System.out.println("coordenadas " + imgml.getX() + " y " + imgml.getY() + ".Tamaño: " + imgml.getWidth() + " por " + imgml.getHeight());
		
		//regresa el texto del componente
		String texto= driver.findElement(By.className("andes-tooltip__text")).getText();
		System.out.println(texto);
		
		
		
		//driver.close();
	}

}
