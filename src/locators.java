import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://accounts.informatica.com/login.html");
		driver.findElement(By.name("username")).sendKeys("venkatesh");
		driver.findElement(By.name("password")).sendKeys("vpm1234567$");
		driver.findElement(By.className("c01-login-form__form")).click();
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[3]/p")).getText());
		Assert.assertEquals((driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[3]/p")).getText()), "Enter your registered email address and password to log in.");
		//driver.findElement(By.linkText("Forgot your password?")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("venkatesh.mankal@gmail.com");

		//driver.quit();
		
	}

}