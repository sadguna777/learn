import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownpractice {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Common Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
		 driver.findElement(By.xpath("//input[@value='option1']")).click();
		 driver.findElement(By.xpath("//input[@value='option1']")).click();
		 
		 System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		 
		 
}
}

