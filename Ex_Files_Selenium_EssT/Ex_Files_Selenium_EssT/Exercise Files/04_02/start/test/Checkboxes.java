import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Checkboxes {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",  "C:/Users/arman/Downloads/Selenium/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        checkbox1.click();

        Thread.sleep(2000);
        WebElement checkbox2 = driver.findElement(By.cssSelector("#checkbox-2"));
        checkbox2.click();

        Thread.sleep(2000);
        WebElement checkbox3 = driver.findElement(By.cssSelector("div.col-sm-8.col-sm-offset-2 input[value='checkbox-3']"));
        checkbox3.click();

        Thread.sleep(3000);
        driver.quit();
    }
}