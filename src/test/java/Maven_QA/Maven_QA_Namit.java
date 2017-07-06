package Maven_QA;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Maven_QA_Namit {
    WebDriver driver=new FirefoxDriver();	
	public void Login()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://way2automation.usefedora.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='navbar']/div/div/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath(".//*[@id='user_email']")).sendKeys("divyaarroa1309@gmail.com");
		driver.findElement(By.xpath(".//*[@id='user_password']")).sendKeys("divyaarrora");
		driver.findElement(By.xpath(".//*[@id='new_user']/div[3]/input")).click();
		if(driver.findElement(By.xpath("//div/div/div/div/div/div[1]/div/div")).getText().contains("Invalid"))
			
		{
			System.out.println("fail");
		}
		else 
			System.out.println("pass");
		
	}

		public void dropDown()
		{
			
		driver.get("http://way2automation.com/way2auto_jquery/index.php");	
		WebElement dropdown=driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[4]/select"));
		// this selects complete dropdwon for country and stores in Var dropdown of type Webelement.
		Select select =new Select(dropdown);  //Select class is used for dropdown
		//System.out.println(select.getOptions()); //used to get all options on console
	List<WebElement> valueList= driver.findElements(By.tagName("option"));
	for(WebElement var: valueList){
		System.out.println(var.getText());
	}
	select.selectByValue("Aruba");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maven_QA_Namit obj= new Maven_QA_Namit();
		//WebDriver driver=new FirefoxDriver();
		//obj.Login();
		obj.dropDown();
		
	}

}

