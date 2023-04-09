package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "Chrome";
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }

        // 1. Open URL
        driver.get(baseUrl);

        // 2. Maximise the browser
        driver.manage().window().maximize();

        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 3. Print the title of the page
        System.out.println(driver.getTitle());

        // 4. Print the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // 5. Print the page source
        System.out.println("Page source: " + driver.getPageSource());

        // 6. Enter the email to email field
        driver.findElement(By.name("user[email]")).sendKeys("prime123@gmail.com");

        // 7. Enter the password to password field
        driver.findElement(By.name("user[password]")).sendKeys("Prime123");

        // 8. Close the browser
        driver.close();
    }
}
