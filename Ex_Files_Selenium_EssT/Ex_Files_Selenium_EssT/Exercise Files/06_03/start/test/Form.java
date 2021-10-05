import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;
//import io.github.cdimascio.dotenv.Dotenv



public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/arman/Downloads/Selenium/chromedriver_win32/chromedriver.exe");

        //  Dotenv dotenv = Dotenv.load()
        // dotenv.get("MY_ENV_VAR1")

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

      
        submitForm(driver);
        waitAlter2Exec(driver);   
        assertEquals("The form was successfully submitted!", customizeMessage(driver));
    
        driver.quit();
    }


    // action to fill and submit the form 
    public static void submitForm( WebDriver action1){

        action1.findElement(By.id("first-name")).sendKeys("Nina");

        action1.findElement(By.id("last-name")).sendKeys("Lyor");

        action1.findElement(By.id("job-title")).sendKeys("Network Test Engineer");

        action1.findElement(By.id("radio-button-3")).click();

        action1.findElement(By.id("checkbox-1")).click();

        action1.findElement(By.cssSelector("option[value='3']")).click();

        action1.findElement(By.id("datepicker")).sendKeys("05/28/2019");
        action1.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        action1.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
    }

    // action to wait the execution f the webpage to display
    public static void waitAlter2Exec(WebDriver action2){

        WebDriverWait wait = new WebDriverWait(action2, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert alert-success")));
    }

    // function to assert the message of the displayed page
    public static String customizeMessage(WebDriver action3){

      return  action3.findElement(By.className("alert alert-success")).getText();

       
    }
}
