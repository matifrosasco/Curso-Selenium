import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.ElementNotInteractableException;
public class alertas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setear webdriver
		System.setProperty("webdriver.Chrome", "C:\\Users\\Usuario\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//descargar archivo html para hacer estas pruebas
		driver.get("file:///C:/Users/Usuario/Documents/Alertas%20HTML.html");
		
		//alerta de aviso
		driver.findElement(By.xpath("/html/body/button[1]")).click();
		//establecemos un wait
		Wait<WebDriver> wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		Alert alert= wait.until(ExpectedConditions.alertIsPresent());
		String text= alert.getText();
		alert.accept();
		System.out.println(text);
		
		//alerta tipo confirmar
		driver.findElement(By.xpath("/html/body/button[2]")).click();
		Wait<WebDriver> wait2=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait2.until(ExpectedConditions.alertIsPresent()); // ver si la alerta esta presente
		Alert alert2 = driver.switchTo().alert(); //cambia a la ventana de alerta
		String text2= alert2.getText();
		alert2.dismiss(); //presionar cancelar
		System.out.println(text2);
		
		//prompt 
		driver.findElement(By.xpath("/html/body/button[3]")).click();
		Wait<WebDriver> wait3=new WebDriverWait(driver,Duration.ofSeconds(5));
		Alert alert3= wait3.until(ExpectedConditions.alertIsPresent());
		alert3.sendKeys("Curso de Seleniun");
		alert3.accept();
		
		
		
		
		

	}

}
