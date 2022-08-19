package assinment1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_application 
{
	//private static final Duration TimeUnit,10 = null;

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SACHIN\\OneDrive\\Desktop\\NEW\\installation_selenium\\chromedriver_win32 (5)\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Thread.sleep(100);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		//driver.close();
		driver.findElement(By.xpath("//input[@name='email_create']")).sendKeys("rohit.sharma8044@gmail.com");
		
		
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Thread.sleep(500);
		
		driver.findElement(By.xpath("(//div[@class='radio'])[1]")).click();
		
		
		
        driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("rohit");
        
        //((JavascriptExecutor)driver).executeScript("arguments[0].value='rohit'", FN);
        
       // ((JavascriptExecutor)driver).executeScript("arguments[0].value='rohit'", FN);
        
		
		driver.findElement(By.xpath("(//input[@class='is_required validate form-control'])[2]")).sendKeys("sharma");
		
//		Thread.sleep(200);
		
        driver.findElement(By.xpath("(//input[@class='is_required validate form-control'])[4]")).sendKeys("Hitman@211");
	
        
        WebElement DAY = driver.findElement(By.xpath("//select[@class='form-control']"));
       
        Select d=new Select(DAY);
        d.selectByIndex(2);
        
        WebElement MONTH = driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
        
        Select m=new Select(MONTH);
        
        m.selectByIndex(1);
        
        
       WebElement YEAR = driver.findElement(By.xpath("(//select[@class='form-control'])[3]"));
       Select y=new Select(YEAR);
       y.selectByIndex(9);
       
       driver.findElement(By.xpath("//input[@type='checkbox']")).click();
       
       Thread.sleep(500);
       
       driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Rossari Biotech");
       
       driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("nashik pune highway, pune");
       
       driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("main buiding pune");
       
       driver.findElement(By.xpath("//input[@id='city']")).sendKeys("pune");
       
       Thread.sleep(500);
       
       WebElement STATE = driver.findElement(By.xpath("//select[@id='id_state']"));
       
       Select s=new Select(STATE);
       s.selectByIndex(1);
       
       Thread.sleep(500);
       
       driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("00000");
       
       WebElement COUNTRY = driver.findElement(By.xpath("//select[@id='id_country']"));
       
       Select c=new Select(COUNTRY);
       c.selectByIndex(1);
       
       driver.findElement(By.xpath("//textarea[@id='other']")).sendKeys("this company are engaged in chemical manufacturing with a focus on specialty chemicals industry.");
       
       driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("0233-225588");
       
       driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("6699888888");
       
       Thread.sleep(500);
        
       driver.findElement(By.xpath("//button[@name='submitAccount']")).click();
       
       driver.findElement(By.xpath("//a[@title='Log me out']")).click();
       
       Thread.sleep(500);
       driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
       
       Thread.sleep(500);
  
       driver.findElement(By.xpath("//input[@id='email']")).sendKeys("rohit.sharma8033@gmail.com");
       
       driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Hitman@211");
       
       driver.findElement(By.xpath("//button[@name='SubmitLogin']")).click();
       
       Thread.sleep(500);
       driver.findElement(By.xpath("//a[@class='sf-with-ul']")).click();
       
     //  Thread.sleep(500);
       
       driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']")).click();
       

    
	}

}
