import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CromeBrowser {
    public static void main(String[] args) {
        String baseurl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // launch URL
        driver.get(baseurl);

        //Maximise window
        driver.manage().window().maximize();

        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //get the tittle of the page
        String tittle = driver.getTitle();
        System.out.println("Page tittle is " + tittle);

        //Get current URL
        System.out.println("Current URL" + driver.getCurrentUrl());

        //Get page source
        System.out.println("Page source" + driver.getPageSource());

        // Find the email field element
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("Admin");

        //Find password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");
        // close the browser
        driver.quit();
    }
}
