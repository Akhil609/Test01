package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class day2_locater_shoping  {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\chrome web driver\\chrome driver 115\\chrome-win32\\chrome-win32\\chromedriver.exe");

		ChromeDriver de= new ChromeDriver();
	
	de.manage().window().maximize();

	de.get("http://www.automationpractice.pl/index.php");
	de.findElement(By.name("submit_search")).click();
	de.findElement(By.id("search_query_top")).sendKeys("T-shirts");
	de.close();
	
	
	}}