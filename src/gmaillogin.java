import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class gmaillogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.cssSelector(".gb_Id")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("venkatesh.mankal@gmail.com");
		driver.findElement(By.linkText("Next")).click();

	}
}

	
