package zu.testselenium;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MyTestNGTests {

    @Test
    public void userTest() throws IOException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("/Users/alexzoo/Documents/projects/pageobjectseleniumtest/src/test/java/zu/testselenium/datadriventest.properties");

        prop.load(fis);

        System.out.println(prop.getProperty("user"));
    }

    @Test
    public void passwordTest() throws IOException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("/Users/alexzoo/Documents/projects/pageobjectseleniumtest/src/test/java/zu/testselenium/datadriventest.properties");

        prop.load(fis);

        System.out.println(prop.getProperty("password"));
    }
}
