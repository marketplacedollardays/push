import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Yeswanth {//Yeswanth
	
	private static WebElement element=null;
	
	public static String name     = "id_fullname";
	public static String email    = "email--1";
	public static String password = "password";
	public static String submit   = "submit-id-submit";
	
	public static WebElement name(WebDriver driver) {
		element=driver.findElement(By.id(name));
		return element;
	}
	
	public static WebElement email(WebDriver driver) {
		element=driver.findElement(By.id("email--1"));
		return element;
	}
	
	public static WebElement password(WebDriver driver) {
		element=driver.findElement(By.id("password"));
		return element;
	}
	
	public static WebElement sumbit(WebDriver driver) {
		element=driver.findElement(By.id("submit-id-submit"));
		return element;
	}
	

	public static void main(String[] avg) throws InterruptedException {
		
		File file = new File("F:\\Software Testing\\Selenium files\\Selenium\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath()); 
		WebDriver driver = new ChromeDriver();
	 //driver.manage().window().maximize();
	   int a=20;
	   for(int i=0;  i<=a;  i++) {
	   String name1 = "Ayesh"+i;
	   String email1="Ayeshthisisforyou"+i+"@gmail.com";
	   String passw= "Ayeshthis123"; 
	  
	    //WebDriverWait wait = new WebDriverWait(driver, 100);
		//WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	    //Category_Body.click();
	    //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
		driver.get("https://www.udemy.com/join/signup-popup/?next=%2Fcourse%2Fsubscribe%2F%3FcourseId%3D3608712");
	     
		Yeswanth.name(driver).sendKeys(name1);
		Yeswanth.email(driver).sendKeys(email1);
		Yeswanth.password(driver).sendKeys(passw);
		Yeswanth.sumbit(driver).submit();
        
      
		
		// select dropdown=new select(driver.findelement(By.id('logoutpage')))
		//dropdown.selectvisibilitytext("Logout");
		// logout
		// delete cookies
		// The process should repeat until all records are created
		//Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		if(i==20) {
			driver.close();
			System.out.println("The task is finished");
		}
	    }
	}	
}
