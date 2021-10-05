import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/arman/Downloads/Selenium/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dragdrop");

        WebElement from = driver.findElement(By.id("image"));
        WebElement to = driver.findElement(By.id("box"));

        Actions action2exec = new Actions(driver);
        Thread.sleep(4000);
        action2exec.dragAndDrop(from, to).build().perform();
        Thread.sleep(3000);


        driver.quit();
    }
}

