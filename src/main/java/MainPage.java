import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    By signInButton = By.xpath("//a[text()='Sign in']");
    By signUpButton = By.xpath("//a[text()='Sign up']");
    By userNameField = By.xpath("//input[@id='user[login]']");
    By emailField = By.xpath("//input[@id='user[email]']");
    By passwordField = By.xpath("//input[@id='user[password]']");
    By signUpFormButton = By.xpath("//button[text()='Sign up for GitHub']");

    //comment







}
