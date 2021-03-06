import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Common Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int j = 0;
		String[] veg = { "Cucumber","Brocolli" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		List<WebElement> elements = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < elements.size(); i++) {
			String[] name = elements.get(i).getText().split("-");
			String s = name[0].trim();
			List itemsNeededList = Arrays.asList(veg);

			if (itemsNeededList.contains(s)) {
				j++;
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				if (j == 3)
					break;
			}
		}

	}

}
