import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Edge {
    public static void main(String[] args) {
        String baseurl = "https://opensource-demo.orangehrmlive.com";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        // launch URL
        driver.get(baseurl);

        //Maximise window
        driver.manage().window().maximize();

        //we give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the tittle of the page
        String title = driver.getTitle();
        System.out.println("page title is " + title);

        // Get current URL
        System.out.println("Current URL " + driver.getCurrentUrl());

        //Get Page source
        System.out.println("Page source " + driver.getPageSource());

        //find the email field element
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("Admin");

        //Find Password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        // close the browser
        driver.quit();
    }
}
