package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
					// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			String property=System.getProperty("webdriver.chrome.driver");
			System.out.println(property);
			//Launch the browser
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps");
			driver.manage().window().maximize();
			
			
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			WebElement logout=driver.findElement(By.className("decorativeSubmit"));
			
			String attribute =logout.getAttribute("value");
			System.out.println(attribute);
			if(attribute.equals("Logout"))
			{
				System.out.println("Successfully logged in");
			}
			
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			
			
			
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Capgemini");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vedha");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("rathinam");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Bhai");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("week2day1");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vedha329@gmail.com");
				
			driver.findElement(By.className("smallSubmit")).click();
			
			String str=driver.getTitle();
			
			System.out.println(str);
			
			
	}

}
