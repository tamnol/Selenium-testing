import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/arman/Downloads/Selenium/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropbox = driver.findElement(By.cssSelector("#dropdownMenuButton"));
        dropbox.click();
        Thread.sleep(2000);

        WebElement fileuploadItem = driver.findElement(By.xpath("/html/body/div/div/div/a[8]"));
        fileuploadItem.click();
        Thread.sleep(2000);
        driver.quit();
    }
}
