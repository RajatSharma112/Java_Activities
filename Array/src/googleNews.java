import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googleNews {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://news.google.com/topstories?gl=IN&hl=en-IN&ceid=IN:en");
		 Thread.sleep(5000);
		 List<WebElement> as = driver.findElements(By.tagName("h3"));
		for (int i=0; i<5; i++) {
		 System.out.println(as.get(i).getText());

	} 
	}
}		
