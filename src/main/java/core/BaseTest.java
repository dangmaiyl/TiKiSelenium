package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
    @BeforeMethod
    public void afterMethod(){
        if(null!=driver){
            driver.close();
        }
    }
    public WebDriver getDriver() {
        return driver;
    }
}
