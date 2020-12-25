import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assisgnment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Common Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		Select hs = new Select(driver.findElement(By.xpath("//select[@id='Adults']")));

		hs.selectByValue("1");
		Select m = new Select(driver.findElement(By.xpath("//select[@id='Childrens']")));
		m.selectByValue("1");
		Select d = new Select(driver.findElement(By.xpath("//select[@id='Infants']")));
		d.selectByValue("1");
		driver.findElement(By.xpath("(//input[@placeholder='Pick a date'])[1]")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ']")).click();
		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
		driver.findElement(By.xpath("//input[@name='airline']")).sendKeys("name");
		driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='homeErrorMessage']")).getText());

	}

}
