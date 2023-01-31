package drivers_init;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class driver_factory {

    public WebDriver driver;


    public WebDriver driverInit() {

        // we can initialize drivers in 3 types in selenium

        //type-1
        //this type we can download drivers and setup
        //  System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\drivers\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        //type-2
        //here we are initialized the drivers
        //1.After selenium 4.6.0 version no need to use the set property
        // WebDriver driver = new ChromeDriver();

        //type-3
        //here we are using webdriver Manager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);


        //  driver.get("http://www.amazon.in");
        driver.get("https://www.google.com/");

        return driver;
    }
}
