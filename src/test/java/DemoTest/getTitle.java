package DemoTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTitle {
	@Test
	public void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		String logintitle = driver.getTitle();
		System.out.println(logintitle);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		String hp = driver.getTitle();
		System.out.println(hp);
	}

}
