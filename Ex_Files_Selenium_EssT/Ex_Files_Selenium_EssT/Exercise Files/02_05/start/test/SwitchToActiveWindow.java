import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/arman/Downloads/Selenium/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    
        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement btnTab = driver.findElement(By.id("new-tab-button"));
        btnTab.click();

        String firstTab = driver.getWindowHandle();

        for(String curhand: driver.getWindowHandles()){
            driver.switchTo().window(curhand);
        }

        driver.switchTo().window(firstTab);

        Thread.sleep(5000);

        driver.quit();
    }
}
