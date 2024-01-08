import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class localizadores_amigables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setear webdriver
		System.setProperty("webdriver.Chrome", "C:\\Users\\Usuario\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		
		//driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(By.className("gb_d"))).click();
		
		//"a" es Imagenes, que esta a la izquierda del cuadro y a la derecha de Gamil.
		driver.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(By.className("gb_d")).toRightOf(By.className("gb_B"))).click();
		
		//iniciar sesion
		driver.findElement(By.linkText("Iniciar sesión")).click();
		
		//Olvido la contraseña 
		driver.findElement(By.cssSelector("button[jsname='Cuz2Ue']")).click();
	}
}
