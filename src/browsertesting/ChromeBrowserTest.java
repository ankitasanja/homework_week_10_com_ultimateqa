package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";

        // 1. Set the Chrome browser
        WebDriver driver = new ChromeDriver();

        // 2. Open URL
        driver.get(baseUrl);

        // Maximise the browser
        driver.manage().window().maximize();

        // We give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 3. Print the title of the page
        System.out.println(driver.getTitle());

        // 4. Print the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // 5. Print the page source
        System.out.println("Page source: " + driver.getPageSource());

        // 6. Enter the email to email field
        driver.findElement(By.id("user[email]")).sendKeys("Prime123@gmail.com");

        // 7. Enter password to password field
        driver.findElement(By.id("user[password]")).sendKeys("Prime123");

        // 8. Close the browser
        driver.close();

    }
}
