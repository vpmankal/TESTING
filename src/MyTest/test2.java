package MyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {
	public void setup(){
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
		String tt= 	driver.getTitle();
		System.out.println(cc);
		
	}

}
