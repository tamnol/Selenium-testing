import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement  {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/arman/Downloads/Selenium/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://formy-project.herokuapp.com/scroll");
      
        WebElement fillform = driver.findElement(By.id("name"));
        Actions motion = new Actions(driver);
        motion.moveToElement(fillform);
        fillform.click();
        fillform.sendKeys("Lucien Tamno");

        WebElement dateform = driver.findElement(By.id("date"));
        dateform.sendKeys("9/9/2021");
        Thread.sleep(5000);

        driver.quit();
    }
}
