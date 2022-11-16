import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox {
    public static void main(String[] args) {
        String baseurl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.firefox.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // launch URL
        driver.get(baseurl);

        //Maximise window
        driver.manage().window().maximize();

        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is " + title);

        //Get current URL
        System.out.println("Current URL " + driver.getCurrentUrl());

        //Get page source
        System.out.println("page source " + driver.getPageSource());

        //find the email field element
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("Admin");

        // Find password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        // Close the browser
        driver.quit();


    }
}