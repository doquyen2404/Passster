import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerifyInvalidPassword {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/doquyen2404/Desktop/Drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String PASSWORD = "doquyen";
        driver.get("http://doquyen.local/2022/05/24/nhung-cau-noi-hay-bang-tieng-anh/");
        String title = driver.getTitle();
        System.out.println(title);

        WebElement password = driver.findElement(By.name("post_password"));
        WebElement enter = driver.findElement(By.name("Submit"));
        password.sendKeys(PASSWORD);
        enter.click();

        String actualUrl = "http://doquyen.local/2022/05/24/nhung-cau-noi-hay-bang-tieng-anh/";
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

        driver.close();
        driver.quit();
    }
}
