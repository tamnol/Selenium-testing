import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",  "C:/Users/arman/Downloads/Selenium/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileUpload = driver.findElement(By.cssSelector("#file-upload-field"));
        fileUpload.sendKeys("C:/Users/arman/Downloads/cheat-sheet.pdf");
        Thread.sleep(3000);

        driver.quit();
    }
}
