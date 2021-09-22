package SeleniumOsnove;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Happy {
	public String username;
	public String password;

		public Happy() {
			super();
			this.username = username;
			this.password = password;
	}

		public void happy() {
	
	System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe" );
	
	WebDriver driver = new ChromeDriver();


    driver.navigate().to("https://the-internet.herokuapp.com/login");
    
    WebElement username= driver.findElement(By.id("username"));
    
    username.clear();
    username.click();
    
    username.sendKeys("tomsmith");
    
    WebElement password= driver.findElement(By.id("password"));
    password.sendKeys("SuperSecretPassword!");
    
    WebElement login= driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
    login.click();
	

    WebElement provera= driver.findElement(By.id("flash"));
	  String provera1=provera.getText();
	  
	  if (provera1.contains("You logged into a secure area")) {
		  System.out.println("PASS");
		  }
		}	
}