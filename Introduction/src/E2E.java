import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Common Files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		 driver.get("http://rediff.com");
		 driver.findElement(By.xpath("//*[text()='Shopping']")).click();
		// driver.findElement(By.xpath("//a[@class='signin']")).click();
		 //driver.findElement(By.xpath("//a[contains(@title='Sign in')]"));
		 //driver.findElement(By.xpath("//div[@class='cell']/input")).sendKeys("Sadguna");

}
}
