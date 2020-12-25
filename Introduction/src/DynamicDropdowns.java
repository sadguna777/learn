

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class DynamicDropdowns {
	

		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Common Files\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			
			 driver.get("http://spicejet.com");
//			 //a[@value='MAA'] -xpath for chennei
			 driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
			 driver.findElement(By.xpath("//a[@value='BLR']")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

}
	}
