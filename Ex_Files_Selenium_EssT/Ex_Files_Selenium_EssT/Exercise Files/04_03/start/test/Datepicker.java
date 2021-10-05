// import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/arman/Downloads/Selenium/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement datefield = driver.findElement(By.id("datepicker"));
        datefield.click();
        datefield.sendKeys("9/15/2021");
        datefield.sendKeys(Keys.RETURN);
        Thread.sleep(2000);
        // WebElement todaydate = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[3]/td[4]"))
        // todaydate.click()
        // Thread.sleep(3000)

        driver.quit();
    }
}