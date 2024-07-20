package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

import page.AmazonPage;
//This is a comment
//Another comment
//commit
//commit2
//change it
public class TestNGFile {
    private WebDriver driver;
    private AmazonPage pageFactory;

    @BeforeTest
    public void initializeDriver() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pageFactory = new AmazonPage(driver);
    }

    @Test(priority = 1)
    public void getAmazonSite() {
        driver.get("https://www.amazon.in/");
    }

    @Test(priority = 2)
    public void searchProduct() {
        pageFactory.searchProduct("IPhone 15");
        pageFactory.clickSearchButton();
    }

    @Test(priority = 3)
    public void selectProduct() {
        pageFactory.clickOnProduct();
    }

    @Test(priority = 4)
    public void changePinCode() {
        pageFactory.click_pinCodeIcon();
        pageFactory.enter_PinCode();
        pageFactory.enter_SubmitButton();
    }

    @Test(priority = 5)
    public void deliberatelyFailTest() {
        driver.get("https://example.com/nonexistent-page");
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Example Domain");
    }

    @AfterTest
    public void tearDownTest() throws InterruptedException {
        Thread.sleep(4000);
        if (driver != null) {
            driver.quit();
        }
        System.out.println("All Test cases passed successfully !!!");
    }
}
