package ConfigProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {


    public static Properties init_prop() {

        Properties prop = new Properties();
        try {
            FileInputStream ip = new FileInputStream(".\\src\\main\\resources\\configFiles\\config.properties");
            prop.load(ip);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop;

    }

    public String getvalue(String key){

        String get = init_prop().get(key).toString();
        return get;

    }
}
