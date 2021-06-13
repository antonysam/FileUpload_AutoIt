import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateGUIFileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// Provide the Chrome driver location
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\samdany\\Desktop\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.manage().window().fullscreen();
		d.manage().deleteAllCookies();
		
		 // Provide the URL to be loaded
		
		d.get("https://smallpdf.com/word-to-pdf");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		// Clicking on Choose Files button
		
		d.findElement(By.xpath("//span[text()='Choose Files']")).click();
		
		// Executes the AutoIT script .exe(Compiled script) in the given location
		
		Runtime.getRuntime().exec("H:\\Users\\samdany\\Desktop\\AutoIT Script\\Fileupload.exe");
		
		Thread.sleep(3000);

	}

}
