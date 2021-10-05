import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",  "C:/Users/arman/Downloads/Selenium/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radiobtn1 = driver.findElement(By.id("radio-button-1"));
        radiobtn1.click();

        Thread.sleep(2000);
        WebElement radiobtn2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radiobtn2.click();

        Thread.sleep(3000);
        WebElement radiobtn3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radiobtn3.click();

        Thread.sleep(4000);
        driver.quit();
    }
}
