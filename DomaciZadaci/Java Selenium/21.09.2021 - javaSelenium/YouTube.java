package SeleniumOsnove;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DomaciZadatakYoutube {

	public static void main(String[] args) {
		/*
		Pomocu jave i selenijuma
		1) otici na sajt youtube
		2) u search-u pronaci Rick Astley i pustiti pesmu Never gonna give you up
		// voditi racuna da ako postoje reklame da ih preskocite
		3) Nakon sto je pustena pesma, iz liste sa desne strane (watch next) pustiti drugi predlozen video
        */
		 System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe" );
			
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.navigate().to("https://www.youtube.com/"); 
		 
		 WebElement searchInput = driver.findElement(By.name("search_query"));
		 searchInput.clear();
		 searchInput.sendKeys("Rick Astley");
		 
		 WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
		 searchButton.click();
		 
		 WebDriverWait wait = new WebDriverWait(driver, 20); 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string"))).click(); 		 
		
	}


}