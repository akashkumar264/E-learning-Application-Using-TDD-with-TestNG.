import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGExample {
    String url = "https://www.simplilearn.com/";
    WebDriver driver;

    @Test
    public void testHomePage() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Online Courses, Video Tutorials, Skill Development Courses - Simplilearn", "Home Page Title Verification Failed");
        driver.quit();
    }
}