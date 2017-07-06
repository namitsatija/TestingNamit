package Maven_QA;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
	
	public class AutomateWebsite {
		FirefoxDriver driver = new FirefoxDriver();
		
		public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\namitsatija\\workspace\\geckodriver\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//AutomateWebsite obj= new AutomateWebsite();
		//obj.FormFill();
		driver.findElement(By.cssSelector("input[name=\"name\"]")).sendKeys("Namit");
		driver.findElement(By.cssSelector("input[name=\"phone\"]")).sendKeys("12345678");
		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("nsatija282@gmail.com");
		driver.findElement(By.cssSelector("input[name=\"city\"]")).sendKeys("Delhi");
		driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[6]/input")).sendKeys("NamitSatija");
		driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[7]/input")).sendKeys("fortis@143");
		driver.findElement(By.cssSelector("a[href='#login']")).click();
		}
		
	/*public void FormFill()
	{
		WebDriverWait wait=new WebDriverWait(driver,10000);       
		wait.until(ExpectedConditions.titleContains("Registration Form"));
		driver.findElement(By.cssSelector("input[name=\"name\"]")).sendKeys("Namit");
		driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[2]/input")).sendKeys("123456789");
		driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[3]/input")).sendKeys("namit@yahoo.com");
	
		driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[5]/input")).sendKeys("Delhi");
		driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[6]/input")).sendKeys("NamitSatija");
		driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[7]/input")).sendKeys("Namit@123");
		
	}*/
	}
	
