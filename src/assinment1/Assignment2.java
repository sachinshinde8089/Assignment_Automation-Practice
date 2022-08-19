package assinment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 
{
	public static void main(String[] args) throws InterruptedException
	
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SACHIN\\OneDrive\\Desktop\\NEW\\installation_selenium\\chromedriver_win32 (5)\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
        //driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
        driver.findElement(By.xpath("//input[@name='email_create']")).sendKeys("rohit.sharma1016@gmail.com");
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Thread.sleep(500);
		
		driver.findElement(By.xpath("(//div[@class='radio'])[1]")).click();
		//driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("rohit");
		
		//driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("rohit");
		
        //driver.findElement(By.xpath("(//input[@class='is_required validate form-control'])[2]")).sendKeys("sharma");
		
        //Thread.sleep(200);
		
       // driver.findElement(By.xpath("(//input[@class='is_required validate form-control'])[4]")).sendKeys("Hitman@211");
		
		
		
	}
	
	
	
	

}
