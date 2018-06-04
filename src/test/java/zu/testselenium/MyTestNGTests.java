package zu.testselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MyTestNGTests {

    WebDriver driver;

    @Test
    public void userTest() throws IOException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver 2");
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver 2");


        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("/Users/alexzoo/Documents/projects/pageobjectseleniumtest/src/test/java/zu/testselenium/datadriven.properties");

        prop.load(fis);

        if (prop.getProperty("browser").contains("chrome")){

            driver = new ChromeDriver();
            System.out.println("Chrome browser");

        } else {

            driver = new FirefoxDriver();
            System.out.println("Firefox browser");
        }


        System.out.println(prop.getProperty("user test"));

        driver.get(prop.getProperty("url"));
        //driver.quit();

    }

    @Test
    public void passwordTest() throws IOException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("/Users/alexzoo/Documents/projects/pageobjectseleniumtest/src/test/java/zu/testselenium/datadriven.properties");

        prop.load(fis);

        System.out.println(prop.getProperty("password test"));
    }
}
