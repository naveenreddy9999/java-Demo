package PageObjectModel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class Login_Page {

    WebDriver driver;

    public Login_Page(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "")
    WebElement loginbutton;


    public void getMethod(String url){

        driver.get(url);
    }




    public void login(){
        loginbutton.click();
    }

}
