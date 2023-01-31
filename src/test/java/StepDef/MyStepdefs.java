package StepDef;

import ConfigProperties.ConfigReader;
import PageObjectModel.Login_Page;
import drivers_init.driver_factory;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

import java.util.Properties;


public class MyStepdefs {

    Login_Page loginPage;
    WebDriver driver;
    ConfigReader configReader = new ConfigReader();
    driver_factory drivers = new driver_factory();
    @Given("open google page")
    public void open_google_page() {

      driver  = drivers.driverInit();
      loginPage = new Login_Page(driver);
      loginPage.getMethod(configReader.getvalue("url"));



    }
}
